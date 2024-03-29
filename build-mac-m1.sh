#!/bin/bash
bash --version
g++ --version
echo "Mac M1 Build"
VER=$(cat mujocoRelease.txt)

TYPE=macosx-arm64
ARCHIVE=mujoco-$VER-macos-universal2.dmg
URL=https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE
echo "$URL"
SCRIPT_DIR=$( pwd )
BUILDDIR=/tmp/
set -e

mkdir -p $BUILDDIR
if [ -f "$BUILDDIR$ARCHIVE" ]; then
    echo "$BUILDDIR$ARCHIVE exists."
else
	rm -rf $BUILDDIR/mujoco*
	curl -L  --location-trusted https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -o $BUILDDIR/$ARCHIVE
	cd $BUILDDIR
	mkdir mujoco
	cd mujoco
	hdiutil attach  ../$ARCHIVE
	find /Volumes/MuJoCo/ -name '*.dylib'
	mkdir $BUILDDIR/mujoco/include
	cp -R /Volumes/MuJoCo/mujoco.framework/Headers/ $BUILDDIR/mujoco/include/mujoco
    mkdir $BUILDDIR/mujoco/lib/
    cp /Volumes/MuJoCo/mujoco.framework/Versions/A/libmujoco.$VER.dylib $BUILDDIR/mujoco/lib/libmujoco.dylib
	
	echo $BUILDDIR/mujoco/
	ls -al $BUILDDIR/mujoco/
	cd /tmp
	echo /tmp
	ls -al
	cd $SCRIPT_DIR/
fi
echo "Include"
ls $BUILDDIR/mujoco/include/
ls $BUILDDIR/mujoco/include/mujoco/
echo "Lib"
ls $BUILDDIR/mujoco/lib/


JAVACPP_VER=1.5.7
JAVACPPDIR=javacpp-platform-$JAVACPP_VER-bin
JAVACPP=$JAVACPPDIR.zip
if [ -f "$JAVACPP" ]; then
    echo "$JAVACPP exists."
else
	curl -L  --location-trusted  https://github.com/bytedeco/javacpp/releases/download/$JAVACPP_VER/$JAVACPP -o $JAVACPP
	unzip $JAVACPP
	echo "JavaCPP:"
	ls -al $JAVACPPDIR
	cd $SCRIPT_DIR/
	
fi
JAVADIR=$SCRIPT_DIR/src/main/java/
cd $SCRIPT_DIR/src/main/java/
cp $BUILDDIR/mujoco/lib/* $JAVADIR/
echo "Moving headers "
rm -rf $JAVADIR/mujoco/
cp -r $BUILDDIR/mujoco/include/mujoco $JAVADIR/
java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar  org/mujoco/MuJoCoConfig.java
java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar -copylibs -copyresources -Xcompiler "-I$JAVADIR" -Xcompiler "-L$JAVADIR" org/mujoco/MuJoCoLib.java

LIBPATH=$PWD/../resources/$TYPE/
mkdir -p $SCRIPT_DIR/src/main/resources/
rm -rf $JAVADIR../resources/$TYPE
find $SCRIPT_DIR|grep $TYPE
mv $JAVADIR/org/mujoco/$TYPE/ $JAVADIR../resources/
cp $BUILDDIR/mujoco/lib/* $JAVADIR../resources/$TYPE/

echo "ls -al $JAVADIR../resources/"
ls -al $JAVADIR../resources/

cd $SCRIPT_DIR/
echo "Resource Files: "
ls -al $JAVADIR../resources/*
ls -al $JAVADIR../resources/$TYPE
./gradlew jar  --stacktrace test


