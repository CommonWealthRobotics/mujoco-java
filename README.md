# mujoco-java
Java JNI binding for mujoco physics system

# Maven

MuJoCo-Java is published on Maven Central via Sonatype. 

![](https://img.shields.io/nexus/r/https/oss.sonatype.org/com.neuronrobotics/mujoco-java.svg?style=flat)

Maven:

```
<dependency>
  <groupId>com.neuronrobotics</groupId>
  <artifactId>mujoco-java</artifactId>
  <version>VERSION_FROM_BADGE</version>
  <type>module</type>
</dependency>
```
Gradle

```
implementation group: 'com.neuronrobotics', name: 'mujoco-java', version: 'VERSION_FROM_BADGE'
```

# HOWTO set up build

1. Export your gpg private key from the system that you have created it.
    1. Find your key-id (using `gpg --list-secret-keys --keyid-format=long`)
    2. Export the gpg secret key to an ASCII file using `gpg --export-secret-keys -a <key-id> > secret.txt`
    3. Edit `secret.txt` using a plain text editor, and replace all newlines with a literal "\n" until everything is on a single line
2. Set up [GitHub Actions secrets](https://help.github.com/en/actions/configuring-and-managing-workflows/creating-and-storing-encrypted-secrets)
    1. Create a secret called `OSSRH_GPG_SECRET_KEY` using the text from your edited `secret.txt` file (the whole text should be in a single line)
    2. Create a secret called `OSSRH_GPG_SECRET_KEY_PASSWORD` containing the password for your gpg secret key
3. Create a GitHub Actions step to install the gpg secret key
    1. Add an action similar to:
        ```yaml
        - id: install-secret-key
          name: Install gpg secret key
          run: |
            cat <(echo -e "${{ secrets.OSSRH_GPG_SECRET_KEY }}") | gpg --batch --import
            gpg --list-secret-keys --keyid-format LONG
        ```
    2. Verify that the secret key is shown in the GitHub Actions logs
    3. You can remove the output from list secret keys if you are confident that this action will work, but it is better to leave it in there
