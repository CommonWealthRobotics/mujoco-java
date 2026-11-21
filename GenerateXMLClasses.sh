#!/bin/bash

# regenerates org/mujoco/xml from the MuJoCo MJCF schema in schema/mjcf.xsd
set -e

mvn generate-sources

# timestamps would make every run dirty the tree
FILES=$(grep -r -l "// Generated on: " src/main/java/org/mujoco/xml/)

for VARIABLE in $FILES
do
	sed -i '/Generated on\:/d' $VARIABLE
	sed -i -e 's/{@link PropertyPath}//g'  $VARIABLE
done
sed -i '/Generated on\:/d' src/main/java/META-INF/*.episode

# javadoc-invalid markup the JAXB plugin copies from its bundled sources
sed -i -e 's|<tt>||g' -e 's|</tt>||g' src/main/java/com/kscs/util/jaxb/*.java
