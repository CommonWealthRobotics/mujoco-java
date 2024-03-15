#!/bin/bash

#cd schema

#xjc -nv -extension -d ../src/main/java/  -b customization.xjb mujoco.xsd

#cd ../

mvn generate-sources

#echo "Error! the generated sources needed extensive hand edits to work correctly!";return 1



FILES=$(grep -r -l "// Generated on: " src/main/java/org/mujoco/xml/)

for VARIABLE in $FILES
do
	sed -i '/Generated on\:/d' $VARIABLE
	sed -i -e 's/{@link PropertyPath}//g'  $VARIABLE
done

#./gradlew javadoc

