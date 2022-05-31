#!/bin/bash
bash --version
g++ --version
echo "Windows Build"
VER=$(cat mujocoRelease.txt)
ARCH=x64
TYPE=macos-universal2
ARCHIVE=mujoco-$VER-$TYPE.dmg
URL=https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE
echo "$URL"
SCRIPT_DIR=$( pwd )
mkdir -p /tmp/
if [ -f "/tmp/$ARCHIVE" ]; then
    echo "/tmp/$ARCHIVE exists."
else
	rm -rf /tmp/mujoco*
	curl -L  --location-trusted https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -o /tmp/$ARCHIVE
	cd /tmp/
	mkdir mujoco
	cd mujoco
	hdiutil attach  ../$ARCHIVE
	find /Volumes/MuJoCo/ -name '*.dylib'
	
	cp -R /Volumes/MuJoCo/mujoco.framework/Headers/ /tmp/mujoco/include
    cp -R /Volumes/MuJoCo/mujoco.framework/Resources/ /tmp/mujoco/lib
	
	echo /tmp/mujoco/
	ls -al /tmp/mujoco/
	cd /tmp
	echo /tmp
	ls -al
	cd $SCRIPT_DIR/
fi
echo "Include"
ls -al /tmp/mujoco/include/
echo "Lib"
ls -al /tmp/mujoco/lib/
exit 0

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

cd $SCRIPT_DIR/src/main/java/
java -jar ../../../javacpp-platform-$JAVACPP_VER-bin/javacpp.jar mujoco/java/MuJoCoConfig.java
java -jar ../../../javacpp-platform-$JAVACPP_VER-bin/javacpp.jar org/mujoco/MuJoCoLib.java
LIBPATH=$PWD/../resources/$TYPE/
mkdir -p $SCRIPT_DIR/src/main/resources/

rm -rf $JAVADIR../resources/$TYPE
mv $JAVADIR/$TYPE/ $JAVADIR../resources/
echo "ls -al $JAVADIR../resources/"
ls -al $JAVADIR../resources/

cd $SCRIPT_DIR/
echo "Resource File: "
ls -al $JAVADIR../resources/$TYPE
./gradlew jar  --stacktrace test



