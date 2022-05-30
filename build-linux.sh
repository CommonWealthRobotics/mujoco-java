#!/bin/bash

echo "Linux Build"
VER=$(cat mujocoRelease.txt)
ARCHIVE=mujoco-$VER-linux-x86_64.tar.gz
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

if [ -f "/tmp/$ARCHIVE" ]; then
    echo "/tmp/$ARCHIVE exists."
else
	rm -rf /tmp/mujoco*
	wget https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -O /tmp/$ARCHIVE
	cd /tmp/
	tar -xf $ARCHIVE
	mv /tmp/mujoco-$VER /tmp/mujoco/
	ln -s /tmp/mujoco $SCRIPT_DIR/
	cd $SCRIPT_DIR/
fi
set -e
JAVACPP_VER=1.5.7
JAVACPP=javacpp-platform-$JAVACPP_VER-bin.zip
if [ -f "$JAVACPP" ]; then
    echo "$JAVACPP exists."
else
	wget https://github.com/bytedeco/javacpp/releases/download/$JAVACPP_VER/$JAVACPP -O $JAVACPP
	unzip $JAVACPP
fi

cd src/main/java/
java -jar ../../../javacpp-platform-1.5.7-bin/javacpp.jar mujoco/java/MuJoCoConfig.java
java -jar ../../../javacpp-platform-1.5.7-bin/javacpp.jar org/mujoco/MuJoCoLib.java
LIBPATH=$PWD/../resources/linux-x86_64/
if [ -e "$LIBPATH/libjniMuJoCoLib.so" ] 
then
	rm $LIBPATH/
    mv linux-x86_64/* $LIBPATH 
else
    mv linux-x86_64/ ../resources/
fi

cd $SCRIPT_DIR/

./gradlew jar  --stacktrace test



