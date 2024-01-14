#!/bin/bash

#git clone https://github.com/CommonWealthRobotics/mujoco-xml-schema-mjcf.git ../mujoco-xml-schema-mjcf

cd schema

xjc -nv -extension -d ../src/main/java/  -b customization.xjb mujoco.xsd

cd ../
