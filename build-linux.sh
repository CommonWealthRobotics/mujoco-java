#!/bin/bash

set -e

: "${JAVA_HOME:?set JAVA_HOME to a JDK 17 or newer}"

echo "Linux Build"
VER=$(cat mujocoRelease.txt)
TYPE=linux-x86_64
ARCHIVE=mujoco-$VER-$TYPE.tar.gz
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
JAVADIR=$SCRIPT_DIR/src/main/java/
RESDIR=$SCRIPT_DIR/src/main/resources/$TYPE/

# javacpp invokes "javac" from PATH for its code generator
export PATH=$JAVA_HOME/bin:$PATH

BUILDDIR=$SCRIPT_DIR/cppbuild
if [ -f "$SCRIPT_DIR/$ARCHIVE" ]; then
    echo "$ARCHIVE exists."
else
    wget https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -O $SCRIPT_DIR/$ARCHIVE
fi
rm -rf $BUILDDIR
mkdir -p $BUILDDIR
cd $BUILDDIR
tar -xf $SCRIPT_DIR/$ARCHIVE
mv $BUILDDIR/mujoco-$VER $BUILDDIR/mujoco/
# the release ships libmujoco.so as a versioned symlink, JavaCPP wants a plain file
rm -f $BUILDDIR/mujoco/lib/libmujoco.so
mv $BUILDDIR/mujoco/lib/libmujoco.so.$VER $BUILDDIR/mujoco/lib/libmujoco.so

cd $SCRIPT_DIR

JAVACPP_VER=1.5.7
JAVACPP=javacpp-platform-$JAVACPP_VER-bin.zip
if [ -f "$JAVACPP" ]; then
    echo "$JAVACPP exists."
else
    wget https://github.com/bytedeco/javacpp/releases/download/$JAVACPP_VER/$JAVACPP -O $JAVACPP
    unzip -q $JAVACPP
fi

cp -f $BUILDDIR/mujoco/lib/libmujoco.so $JAVADIR
cp -rf $BUILDDIR/mujoco/include/mujoco $JAVADIR

cd $JAVADIR

echo "JavaCPP configs:"
$JAVA_HOME/bin/java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar -Dcompiler.includepath=$BUILDDIR/include/ -print properties.includepath

$JAVA_HOME/bin/java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar org/mujoco/MuJoCoConfig.java

echo "Start compile"
$JAVA_HOME/bin/java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar -copylibs -copyresources -Xcompiler "-no-pie" -Xcompiler "-I$JAVADIR" -Xcompiler "-L$JAVADIR" org/mujoco/MuJoCoLib.java

rm -rf $RESDIR
mkdir -p $SCRIPT_DIR/src/main/resources
mkdir -p $RESDIR
mv $JAVADIR/org/mujoco/$TYPE/* $RESDIR
mv $JAVADIR/libmujoco.so $RESDIR
rm -rf $JAVADIR/mujoco

cd $SCRIPT_DIR
echo "Resources:"
ls -al $RESDIR
$SCRIPT_DIR/gradlew jar --stacktrace test
