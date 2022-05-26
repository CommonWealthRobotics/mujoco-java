#!/bin/bash

echo "Linux Build"
VER=$(cat mujocoRelease.txt)
ARCHIVE=mujoco-$VER-linux-x86_64.tar.gz
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

if [ -f "/tmp/$ARCHIVE" ]; then
    echo "/tmp/$ARCHIVE exists."
else
	rm -rf /tmp/mujoco-$VER
	rm  mujoco-$VER
	wget https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -O /tmp/$ARCHIVE
	cd /tmp/
	tar -xf $ARCHIVE
	mv /tmp/mujoco-$VER /tmp/mujoco/
	ln -s /tmp/mujoco $SCRIPT_DIR/
fi

./gradlew jar test



