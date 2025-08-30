# maven-central-example

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