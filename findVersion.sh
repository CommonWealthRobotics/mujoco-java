#!/bin/bash
# Prints the version to publish, derived from git tags.
#
#   exact tag   -> that tag                 e.g. 4.0.1-pre1
#   otherwise   -> <latest tag>-<hash>-SNAPSHOT
set -e

git fetch --tags --quiet 2>/dev/null || true

TAG=$(git tag --sort=-creatordate | head -1)
[ -n "$TAG" ] || TAG="0.0.0"

EXACT=$(git describe --tags --exact-match 2>/dev/null || true)
if [ -z "$EXACT" ]; then
	HASH=$(git rev-parse --short HEAD)
	echo "${TAG}-${HASH}-SNAPSHOT"
else
	echo "$EXACT"
fi
