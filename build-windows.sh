#!/bin/bash

echo "Windows Build"
VER=$(cat mujocoRelease.txt)
TYPE=windows-x86_64
ARCHIVE=mujoco-$VER-$TYPE.zip
URL=https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE
echo "https://github.com/deepmind/mujoco/releases/download/2.2.0/mujoco-2.2.0-windows-x86_64.zip"
echo "$URL"
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

if [ -f "/tmp/$ARCHIVE" ]; then
    echo "/tmp/$ARCHIVE exists."
else
	rm -rf /tmp/mujoco*
	curl -L  --location-trusted https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -o /tmp/$ARCHIVE
	cd /tmp/
	7z x $ARCHIVE
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
	curl -L  --location-trusted  https://github.com/bytedeco/javacpp/releases/download/$JAVACPP_VER/$JAVACPP -o $JAVACPP
	7z x $JAVACPP
fi

cd src/main/java/
java -jar ../../../javacpp-platform-1.5.7-bin/javacpp.jar mujoco/java/MuJoCoConfig.java
java -jar ../../../javacpp-platform-1.5.7-bin/javacpp.jar org/mujoco/MuJoCoLib.java
LIBPATH=$PWD/../resources/$TYPE/
ls -al
rm -rf ../resources/$TYPE
mv $TYPE/ ../resources/


cd $SCRIPT_DIR/

./gradlew jar  --stacktrace test



