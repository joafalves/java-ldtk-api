# Java LDTK API data library

![](https://img.shields.io/badge/java-%3E%3D%208-green)
![](https://img.shields.io/badge/latest%20version-0.9.3-blue)

### What is this repository for? ###

This repository contains a full data model based on the latest API schema of [LDTK](https://ldtk.io/) (schema-extracted
using [QuickType](https://quicktype.io/)). In addition, also provides a set of converters to load the data model from a valid JSON source file.

### Examples ###

Load the data model from a valid LDTK json file:

`var projectData = LdtkConverter.fromJsonString(loadResourceFile("./data.json"));`

### Importing ###

The library is available as a Maven dependency on
repo [s01.oss.sonatype.org](https://s01.oss.sonatype.org/content/repositories/releases/) with the following coordinates:

`io.github.joafalves:java-ldtk-api`

Notice that the version matches the JSON version of the data model (minimum version is '0.9.3').

**Repository:**

`https://s01.oss.sonatype.org/content/repositories/releases/`

**Gradle Import:**

```
repositories {
    maven { url 'https://s01.oss.sonatype.org/content/repositories/releases/' }
}

dependencies {
    implementation 'io.github.joafalves:java-ldtk-api:latest.release'
}
```

**Maven Import:**

```
<dependency>
    <groupId>io.github.joafalves</groupId>
    <artifactId>java-ldtk-api</artifactId>
</dependency>
```

### Project Structure ###

This project is structured as follows:

##### Root Directory Structure #####

    .src/
        ├── main                    # Main classes
        └── test                    # Test classes
    .build.gradle                   # Gradle build file
    .settings.gradle                # Gradle settings file

### Third-party libs ###

    fasterxml.jackson   (implementation)
    lombok              (compile)
    junit5              (test)

### Setup Requirements ###

1. Java 8+
2. Gradle 6.x+

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact
