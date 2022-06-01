#!/bin/bash

cat <(echo -e $OSSRH_GPG_SECRET_KEY) | gpg1 --batch --import
gpg1 --list-secret-keys --keyid-format LONG

ls -al $HOME/.gnupg/

./gradlew publish -Psigning.secretKeyRingFile=$HOME/.gnupg/secring.gpg -Psigning.password=$OSSRH_GPG_SECRET_KEY_PASSWORD -Psigning.keyId=$OSSRH_GPG_SECRET_KEY_ID
# copy the jar up for release
cp  build/libs/mujoco-java-$VERSION_SEMVER.jar  mujoco-java.jar
# close and release Sonatype
./gradlew closeAndReleaseRepository -PnexusUsername=$MAVEN_USERNAME -PnexusPassword=$MAVEN_PASSWORD

