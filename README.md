# mujoco-java

Java JNI binding for [mujoco physics system](https://github.com/google-deepmind/mujoco)

# Platforms

This library supports

* Windows x86_64
* Linux x86_64
* MacOS x86_64
* MacOS arm64 (M1, M2, M3)

# Examples

An example of loading a MuJoCo model and display in JavaFX 3d:

https://github.com/madhephaestus/MuJoCoTest/releases 

Examples are designed to run in [Bowler Studio](http://commonwealthrobotics.com)

# Clojars

[![Clojars Project](https://img.shields.io/clojars/v/com.neuronrobotics/mujoco-java.svg)](https://clojars.org/com.neuronrobotics/mujoco-java)

MuJoCo-Java is published to [Clojars](https://clojars.org/com.neuronrobotics/mujoco-java).

Maven:

```
<dependency>
  <groupId>com.neuronrobotics</groupId>
  <artifactId>mujoco-java</artifactId>
  <version>4.0.1-pre1</version>
</dependency>
```

Leiningen / Clojure:

```clojure
[com.neuronrobotics/mujoco-java "4.0.1-pre1"]
```

Gradle:

```
repositories {
	maven { url 'https://repo.clojars.org/' }
}

dependencies {
	implementation group: 'com.neuronrobotics', name: 'mujoco-java', version: '4.0.1-pre1'
}
```

# Windows System Dep

installing VC++ redist from:

``` 
https://www.microsoft.com/en-gb/download/details.aspx?id=48145
```

# Build

The binding tracks the MuJoCo release in `mujocoRelease.txt`. The XML schema
`schema/mjcf.xsd` is vendored from that same release; regenerate the JAXB
classes with `bash GenerateXMLClasses.sh` after upgrading it.

The JDK is pinned in the `jvm` submodule (`jvm/jvm.json`), not taken from
`JAVA_HOME` or `PATH`. The build scripts source `setupJvm.sh`, which installs
that JDK to `~/bin/CaDoodle-ApplicationInstall/` on first use and then exports
`JAVA_HOME`/`PATH` for the rest of the build. Clone with submodules:

```
git clone --recurse-submodules <url>
git submodule update --init jvm    # existing checkouts
```

`jq` must be on `PATH`; the `jvm` scripts use it to read `jvm.json`. Override
the install location or pin with `JDK_INSTALL_ROOT` / `JVM_KEY`.

Windows `bash build-windows.sh`

Linux `bash build-linux.sh`

Mac x86 `bash build-mac.sh`

Mac arm64 `bash build-mac-m1.sh`

The mac scripts are architecture-specific: run the one matching `uname -m`.
`macos-15` GitHub runners are arm64, so CI uses `build-mac-m1.sh`. Each script
aborts if JavaCPP produced a different arch directory than it expects.



# Publishing

Publishing goes to [Clojars](https://clojars.org/com.neuronrobotics/mujoco-java)
and is triggered by pushing a tag. The tag is the published version:

```
git tag 4.0.1-pre1
git push origin 4.0.1-pre1
```

The `release.yml` workflow builds each platform, collects the natives, then
runs `publish.sh <version>` from the tag.

## Credentials

Create a deploy token at https://clojars.org/profile, then export it locally:

```
export CLOJARS_USERNAME=...
export CLOJARS_TOKEN=...
```

For CI, add them as repository secrets `CLOJARS_USERNAME` and `CLOJARS_TOKEN`.

## Publishing locally

The jar bundles whatever is in `src/main/resources/<platform>/`, so run the
platform build scripts first (or fetch the CI artifacts) to get all the natives,
then:

```
./publish.sh 4.0.1-pre1
```

`publish.sh` refuses to run without both environment variables, and warns when
no natives are present.
