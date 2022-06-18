#!/bin/bash
bash --version
g++ --version
echo "Windows Build"
echo "PATH=$PATH"
echo "GITHUB_WORKSPACE=$GITHUB_WORKSPACE"

export VER=$(cat mujocoRelease.txt)
export TYPE=windows-x86_64
export ARCHIVE=mujoco-$VER-$TYPE.zip
export URL=https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE
echo "$URL"
SCRIPT_DIR=$( pwd )
JAVADIR=$SCRIPT_DIR/src/main/java/
BUILDDIR=/tmp/
mkdir -p $BUILDDIR
if [ -f "$BUILDDIR$ARCHIVE" ]; then
    echo "$BUILDDIR$ARCHIVE exists."
else
	curl -L  --location-trusted https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -o $BUILDDIR$ARCHIVE
	cd $BUILDDIR
	mkdir mujoco
	cd mujoco
	7z x ../$ARCHIVE
	echo $BUILDDIRmujoco
	ls -al $BUILDDIRmujoco
	cd $BUILDDIR
	echo $BUILDDIR
	ls -al
	echo "Top level" 
	ls -al /
	cd $SCRIPT_DIR/
fi

cd $SCRIPT_DIR/
echo "Include"
ls $BUILDDIR/mujoco/include/
ls $BUILDDIR/mujoco/include/mujoco/
echo "Lib"
ls $BUILDDIR/mujoco/lib/
set -e
JAVACPP_VER=1.5.7
JAVACPPDIR=javacpp-platform-$JAVACPP_VER-bin
JAVACPP=$JAVACPPDIR.zip
if [ -f "$JAVACPP" ]; then
    echo "$JAVACPP exists."
else
	curl -L  --location-trusted  https://github.com/bytedeco/javacpp/releases/download/$JAVACPP_VER/$JAVACPP -o $JAVACPP
	7z x $JAVACPP
	echo "JavaCPP:"
	ls -al $JAVACPPDIR
	cd $SCRIPT_DIR/
	
fi
cp $BUILDDIR/mujoco/lib/* $JAVADIR/
mv $BUILDDIR/mujoco/include/mujoco $JAVADIR/
cd $JAVADIR
java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar  org/mujoco/MuJoCoConfig.java
java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar -copylibs -copyresources -Xcompiler "-I$JAVADIR" -Xcompiler "-L$JAVADIR" org/mujoco/MuJoCoLib.java

LIBPATH=$PWD/../resources/$TYPE/
mkdir -p $SCRIPT_DIR/src/main/resources/

echo "ls -al JAVADIR $JAVADIR"
ls -al $JAVADIR

rm -rf $JAVADIR../resources/$TYPE
find $SCRIPT_DIR|grep $TYPE
mv $JAVADIR/$TYPE/ $JAVADIR../resources/
cp $BUILDDIR/mujoco/lib/* $JAVADIR../resources/$TYPE/

echo "ls -al $JAVADIR../resources/"
ls -al $JAVADIR../resources/

cd $SCRIPT_DIR/
echo "Resource File: "
ls -al $JAVADIR../resources/$TYPE
./gradlew jar  --stacktrace test



