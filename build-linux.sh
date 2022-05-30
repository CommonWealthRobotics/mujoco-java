#!/bin/bash

echo "Linux Build"
VER=$(cat mujocoRelease.txt)
TYPE=$TYPE
ARCHIVE=mujoco-$VER-$TYPE.tar.gz
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
java -jar ../../../javacpp-platform-$JAVACPP_VER-bin/javacpp.jar mujoco/java/MuJoCoConfig.java
java -jar ../../../javacpp-platform-$JAVACPP_VER-bin/javacpp.jar org/mujoco/MuJoCoLib.java
LIBPATH=$PWD/../resources/$TYPE/
mkdir -p src/main/resources/

rm -rf ../resources/$TYPE
mv $TYPE/ ../resources/

cd $SCRIPT_DIR/

./gradlew jar  --stacktrace test



