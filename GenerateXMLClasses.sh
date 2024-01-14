#!/bin/bash

#git clone https://github.com/CommonWealthRobotics/mujoco-xml-schema-mjcf.git ../mujoco-xml-schema-mjcf

cd ../mujoco-xml-schema-mjcf

xjc -nv -Xfluent-builder -extension -d ../mujoco-java/src/main/java/  -b customization.xjb mujoco.xsd

cd ../mujoco-java
