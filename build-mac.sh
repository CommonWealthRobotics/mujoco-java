#!/bin/bash
bash --version
g++ --version
echo "Windows Build"
VER=$(cat mujocoRelease.txt)
ARCH=x64
TYPE=macosx-x86_64
ARCHIVE=mujoco-$VER-macos-universal2.dmg
URL=https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE
echo "$URL"
SCRIPT_DIR=$( pwd )
BUILDDIR=/tmp/
mkdir -p $BUILDDIR
if [ -f "$BUILDDIR$ARCHIVE" ]; then
    echo "$BUILDDIR$ARCHIVE exists."
else
	rm -rf $BUILDDIRmujoco*
	curl -L  --location-trusted https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -o $BUILDDIR$ARCHIVE
	cd $BUILDDIR
	mkdir mujoco
	cd mujoco
	hdiutil attach  ../$ARCHIVE
	find /Volumes/MuJoCo/ -name '*.dylib'
	mkdir $BUILDDIRmujoco/include
	cp -R /Volumes/MuJoCo/mujoco.framework/Headers/ $BUILDDIRmujoco/include/mujoco
    mkdir $BUILDDIRmujoco/lib/
    cp /Volumes/MuJoCo/mujoco.framework/Versions/A/libmujoco.$VER.dylib $BUILDDIRmujoco/lib/libmujoco.dylib
	
	echo $BUILDDIRmujoco/
	ls -al $BUILDDIRmujoco/
	cd /tmp
	echo /tmp
	ls -al
	cd $SCRIPT_DIR/
fi
echo "Include"
ls $BUILDDIRmujoco/include/
ls $BUILDDIRmujoco/include/mujoco/
echo "Lib"
ls $BUILDDIRmujoco/lib/

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
JAVADIR=$SCRIPT_DIR/src/main/java/
cd $SCRIPT_DIR/src/main/java/
mv $BUILDDIR/mujoco/lib/* $JAVADIR/
mv $BUILDDIR/mujoco/include/mujoco $JAVADIR/
java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar  org/mujoco/MuJoCoConfig.java
java -jar $SCRIPT_DIR/javacpp-platform-$JAVACPP_VER-bin/javacpp.jar -copylibs -copyresources -Xcompiler "-I$JAVADIR" -Xcompiler "-L$JAVADIR" org/mujoco/MuJoCoLib.java

LIBPATH=$PWD/../resources/$TYPE/
mkdir -p $SCRIPT_DIR/src/main/resources/
rm -rf $JAVADIR../resources/$TYPE
mv $JAVADIR/$TYPE/ $JAVADIR../resources/
cp $BUILDDIRmujoco/lib/* $JAVADIR../resources/$TYPE/

echo "ls -al $JAVADIR../resources/"
ls -al $JAVADIR../resources/

cd $SCRIPT_DIR/
echo "Resource File: "
ls -al $JAVADIR../resources/$TYPE
./gradlew jar  --stacktrace test



