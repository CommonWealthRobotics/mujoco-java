#!/bin/bash

echo "Windows Build"
VER=$(cat mujocoRelease.txt)
TYPE=windows-x86_64
ARCHIVE=mujoco-$VER-$TYPE.zip
URL=https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE
echo "https://github.com/deepmind/mujoco/releases/download/2.2.0/mujoco-2.2.0-windows-x86_64.zip"
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
	7z x ../$ARCHIVE
	echo /tmp/mujoco/
	ls -al /tmp/mujoco/
	cd /tmp
	echo /tmp
	ls -al
	cd $SCRIPT_DIR/
fi
echo "Include"
ls /tmp/mujoco/include/
echo "Lib"
ls /tmp/mujoco/lib/
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
ls -al
mkdir -p $SCRIPT_DIR/src/main/resources/

rm -rf $SCRIPT_DIR/src/main/java/../resources/$TYPE
mv $SCRIPT_DIR/src/main/java/$TYPE/ $SCRIPT_DIR/src/main/java/../resources/


cd $SCRIPT_DIR/

./gradlew jar  --stacktrace test



