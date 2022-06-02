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
echo "https://github.com/deepmind/mujoco/releases/download/2.2.0/mujoco-2.2.0-windows-x86_64.zip"
echo "$URL"
SCRIPT_DIR=$( pwd )
JAVADIR=$SCRIPT_DIR/src/main/java/
mkdir -p /tmp/
if [ -f "/tmp/$ARCHIVE" ]; then
    echo "/tmp/$ARCHIVE exists."
else
	rm -rf /tmp/mujoco*
	curl -L  --location-trusted https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -o /tmp/$ARCHIVE
	cd /tmp
	mkdir mujoco
	cd mujoco
	7z x ../$ARCHIVE
	echo /tmp/mujoco
	ls -al /tmp/mujoco
	cd /tmp
	echo /tmp
	ls -al
	echo "Top level" 
	ls -al /
	cd $SCRIPT_DIR/
	#mv /tmp/mujoco/include/mujoco /usr/include/
	#mkdir /lib/mujoco/
	#mv /tmp/mujoco/lib/* /lib/mujoco/
fi
cd $JAVADIR
javac mujoco/java/Search.java;java mujoco.java.Search
cd $SCRIPT_DIR/
echo "Include"
ls /tmp/mujoco/include/
ls /tmp/mujoco/include/mujoco/
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
mkdir -p $SCRIPT_DIR/src/main/resources/

rm -rf $JAVADIR../resources/$TYPE
mv $JAVADIR/$TYPE/ $JAVADIR../resources/
echo "ls -al $JAVADIR../resources/"
ls -al $JAVADIR../resources/

cd $SCRIPT_DIR/
echo "Resource File: "
ls -al $JAVADIR../resources/$TYPE
./gradlew jar  --stacktrace test



