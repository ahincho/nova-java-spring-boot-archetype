# Nova Spring Boot Archetype

A Maven archetype that generates a Spring Boot service already sitting on
the Nova Platform: the parent POM, the meta-starter, an annotated
`Application` class, an `application.yaml` and a passing context test.

## Generate a project

```bash
mvn archetype:generate \
  -DarchetypeGroupId=pe.edu.nova.java \
  -DarchetypeArtifactId=nova-spring-boot-archetype \
  -DarchetypeVersion=0.1.0-SNAPSHOT \
  -DgroupId=com.acme \
  -DartifactId=billing-service \
  -Dversion=1.0.0
```

`package` defaults to `groupId` if you do not pass it.

The archetype resolves from GitHub Packages, so `~/.m2/settings.xml`
needs a server entry with a token that has `read:packages`.

## What you get

```
billing-service/
├── pom.xml                              inherits nova-spring-boot-parent
└── src
    ├── main/java/com/acme/Application.java
    ├── main/resources/application.yaml
    └── test/java/com/acme/ApplicationTest.java
```

`Application` is annotated with `@NovaSpringBootApplication`, so the
generated service already answers with `ApiResponse<T>`, turns exceptions
into `ApiError`, and has masking, dates and mapping on the classpath.

Run it:

```bash
cd billing-service
mvn spring-boot:run
```

## Which one should I use

| You want | Use |
|---|---|
| A new Maven service | this archetype |
| A new Gradle service | [nova-java-spring-boot-gradle-plugin](https://github.com/ahincho/nova-java-spring-boot-gradle-plugin) |
| A new Quarkus service | [nova-java-quarkus-archetype](https://github.com/ahincho/nova-java-quarkus-archetype) |
| To add Nova to an existing project | [nova-java-spring-boot-starter](https://github.com/ahincho/nova-java-spring-boot-starter) |

## Requirements

Java 25, Maven 3.9+.

## License

Eclipse Public License 2.0 — see [LICENSE](LICENSE).

Copyright © 2026 Angel Hincho.
