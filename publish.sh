#!/bin/bash

cat <(echo -e "$OSSRH_GPG_SECRET_KEY") | gpg --batch --import
gpg --list-secret-keys --keyid-format LONG

./gradlew publish -Psigning.secretKeyRingFile=$HOME/.gnupg/secring.gpg -Psigning.password=$OSSRH_GPG_SECRET_KEY_PASSWORD -Psigning.keyId=$OSSRH_GPG_SECRET_KEY_ID
