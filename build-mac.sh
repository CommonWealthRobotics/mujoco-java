#!/bin/bash
set -e
if [[ $(uname -m) == 'arm64' ]]; then
	bash build-mac-m1.sh
else
	bash build-mac-x86.sh
fi