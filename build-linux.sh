#!/bin/bash

echo "Linux Build"
VER=$(cat mujocoRelease.txt)
ARCHIVE=mujoco-$VER-linux-x86_64.tar.gz

if [ -f "$ARCHIVE" ]; then
    echo "$ARCHIVE exists."
else
	rm -rf mujoco-$VER
	wget https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -O $ARCHIVE
	tar -xf $ARCHIVE
fi



