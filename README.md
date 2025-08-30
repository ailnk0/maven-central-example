# maven-central-example

## Maven Central

https://central.sonatype.org/

1. Sign in to the Maven Central

2. Get your namespace

3. Generating a Central User Token

## GPG

```
gpg --full-generate-key

Please select what kind of key you want:
> (1) RSA and RSA

RSA keys may be between 1024 and 4096 bits long.
> 4096

Please specify how long the key should be valid.
> 2y

Real name:
> YOUR_NAME

Email address:
> YOUR_EMAIL

gpg --list-keys

gpg --keyserver keyserver.ubuntu.com --send-keys YOUR_KEY_ID
```

## Maven Central Settings

~/.m2/settings.xml

```xml
<settings>
    <servers>
        <server>
            <id>central</id>
            <username>CENTRAL_TOKEN_USERNAME</username>
            <password>CENTRAL_TOKEN_PASSWORD</password>
        </server>
    </servers>
    <profiles>
        <profile>
            <id>central</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <gpg.executable>gpg</gpg.executable>
                <gpg.passphrase>GPG_PASSPHRASE</gpg.passphrase>
            </properties>
        </profile>
    </profiles>
</settings>
```