#!/bin/bash

cat <(echo -e $OSSRH_GPG_SECRET_KEY) | gpg1 --batch --import
gpg1 --list-secret-keys --keyid-format LONG

ls -al $HOME/.gnupg/

./gradlew publish -Psigning.secretKeyRingFile=$HOME/.gnupg/secring.gpg -Psigning.password=$OSSRH_GPG_SECRET_KEY_PASSWORD -Psigning.keyId=$OSSRH_GPG_SECRET_KEY_ID
