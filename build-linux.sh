#!/bin/bash

echo "Linux Build"
VER=$(cat mujocoRelease.txt)
TYPE=linux-x86_64
ARCHIVE=mujoco-$VER-$TYPE.tar.gz
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
JAVADIR=$SCRIPT_DIR/src/main/java/

BUILDDIR=$SCRIPT_DIR/cppbuild
if [ -f "$SCRIPT_DIR/$ARCHIVE" ]; then
    echo "$ARCHIVE exists."
else
	wget https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -O $SCRIPT_DIR/$ARCHIVE
fi
rm -rf $SCRIPT_DIR/cppbuild
mkdir -p $BUILDDIR
cd $BUILDDIR
tar -xf $SCRIPT_DIR/$ARCHIVE
mv $BUILDDIR/mujoco-$VER $BUILDDIR/mujoco/
rm $BUILDDIR/mujoco/lib/libmujoco.so
mv $BUILDDIR/mujoco/lib/libmujoco.so.$VER $BUILDDIR/mujoco/lib/libmujoco.so
mv $BUILDDIR/mujoco/lib/* $JAVADIR/
mv $BUILDDIR/mujoco/include/mujoco $JAVADIR/

cd $SCRIPT_DIR/


set -e
JAVACPP_VER=1.5.7
JAVACPP=javacpp-platform-$JAVACPP_VER-bin.zip
if [ -f "$JAVACPP" ]; then
    echo "$JAVACPP exists."
else
	wget https://github.com/bytedeco/javacpp/releases/download/$JAVACPP_VER/$JAVACPP -O $JAVACPP
	unzip $JAVACPP
fi
echo "Include"
ls $JAVADIR/mujoco/
echo "Lib"
ls $BUILDDIR/
cd $JAVADIR

echo "JavaCPP configs:"
java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar -Dcompiler.includepath=$BUILDDIR/include/ -print properties.includepath

java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar  org/mujoco/MuJoCoConfig.java
java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar -copylibs -copyresources -Xcompiler "-I$JAVADIR" -Xcompiler "-L$JAVADIR" org/mujoco/MuJoCoLib.java
LIBPATH=$PWD/../resources/$TYPE/
mkdir -p $SCRIPT_DIR/src/main/resources/

rm -rf $JAVADIR../resources/$TYPE
mv $JAVADIR/org/mujoco/$TYPE/ $JAVADIR../resources/
rm $JAVADIR/libmujoco.so 
rm -rf $JAVADIR/mujoco
echo "ls -al $JAVADIR../resources/"
ls -al $JAVADIR../resources/

cd $SCRIPT_DIR/
echo "Resources: "
ls -al $JAVADIR../resources/$TYPE
#mv $BUILDDIR/mujoco/ $BUILDDIR/mujoco-back/
./gradlew jar  --stacktrace test
#mv $BUILDDIR/mujoco-back/ $BUILDDIR/mujoco/


