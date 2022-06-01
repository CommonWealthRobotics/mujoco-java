export JAVA_HOME="/cygdrive/c/Program Files (x86)/Commonwealth Robotics BowlerStudio/BowlerStudioApp/jre/"
export PATH=${PATH}:/cygdrive/c/mingw64/bin/:"/cygdrive/c/Program Files/7-Zip/":${JAVA_HOME}
echo $PATH
g++ --version
"$JAVA_HOME/bin/java.exe" --version
7z --version
bash build-windows.sh 