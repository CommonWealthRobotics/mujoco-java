#!/bin/bash

#cd schema

#xjc -nv -extension -d ../src/main/java/  -b customization.xjb mujoco.xsd

#cd ../

mvn generate-sources

#echo Error! the generated sources needed extensive hand edits to work correctly!
