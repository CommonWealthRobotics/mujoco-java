#!/bin/bash
# Publishes the built jar to Clojars.
#
#   ./publish.sh 4.0.1-pre1        # explicit version
#   VERSION_SEMVER=... ./publish.sh
#
# Requires CLOJARS_USERNAME and CLOJARS_TOKEN (https://clojars.org/profile);
# build.gradle reads both straight from the environment.
# Run the platform build scripts first so src/main/resources holds every arch.
set -e

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

missing=()
[ -n "${CLOJARS_USERNAME:-}" ] || missing+=("CLOJARS_USERNAME")
[ -n "${CLOJARS_TOKEN:-}" ] || missing+=("CLOJARS_TOKEN")
if [ ${#missing[@]} -gt 0 ]; then
	echo "Error: missing environment variables: ${missing[*]}" >&2
	echo "Create them at https://clojars.org/profile" >&2
	exit 1
fi

# install and use the JDK pinned in the jvm submodule
. "$SCRIPT_DIR/setupJvm.sh"

VERSION=${1:-${VERSION_SEMVER:-}}
if [ -z "$VERSION" ]; then
	echo "Error: no version. Pass it as \$1 or set VERSION_SEMVER." >&2
	exit 1
fi

cd "$SCRIPT_DIR"

# the jar only ships what is in src/main/resources, and consumers resolve
# natives by os/arch at runtime, so a partial jar is broken for those users
required=(linux-x86_64 linux-arm64 macosx-arm64 windows-x86_64)
missing_natives=()
for p in "${required[@]}"; do
	[ -d "src/main/resources/$p" ] || missing_natives+=("$p")
done
if [ ${#missing_natives[@]} -gt 0 ]; then
	echo "Error: missing native resources: ${missing_natives[*]}" >&2
	echo "Build them (or download the CI artifacts) before publishing." >&2
	exit 1
fi
echo "Packaging native resources:"
ls src/main/resources

echo "Publishing $VERSION to Clojars"
VERSION_SEMVER=$VERSION ./gradlew publish --no-daemon -PmavenRepo=clojars
