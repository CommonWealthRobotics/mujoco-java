#!/usr/bin/env bash
# Installs the JDK pinned in jvm/jvm.json and exports JAVA_HOME/PATH for the build.
# Source this from the build scripts: . "$SCRIPT_DIR/setupJvm.sh"
#
# The jvm submodule resolves the archive per OS/arch, so nothing here is
# platform-specific. Overrides it honours: JDK_INSTALL_ROOT, JVM_KEY,
# JVM_MAJOR_VERSION, JDK_ARCHIVE_PATH.
set -euo pipefail

SETUPJVM_DIR=$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" &>/dev/null && pwd)
JVM_SCRIPTS=$SETUPJVM_DIR/jvm

[ -d "$JVM_SCRIPTS" ] || {
	echo "jvm submodule missing: run 'git submodule update --init jvm'" >&2
	return 1 2>/dev/null || exit 1
}

# getJdk*/installJdk.sh parse jvm.json with jq; Git Bash and fresh MSYS2 lack it
command -v jq >/dev/null 2>&1 || {
	echo "jq is required by jvm/*.sh but was not found on PATH" >&2
	return 1 2>/dev/null || exit 1
}

bash "$JVM_SCRIPTS/installJdk.sh"

JAVA_HOME=$(bash "$JVM_SCRIPTS/getJdkHome.sh")
export JAVA_HOME
# javacpp shells out to javac/g++ from PATH, and gradlew launches via java
export PATH=$JAVA_HOME/bin:$PATH

echo "JAVA_HOME=$JAVA_HOME"
