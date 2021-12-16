# Java LDTK API data library

### What is this repository for? ###

This repository contains a full data model based on the latest API schema of [LDTK](https://ldtk.io/) (schema-extracted)
. In addition, also provides a set of converters to load the data model from a valid JSON source file.

### Examples ##

Load the data model from a valid LDTK json file:

`var projectData = LdtkConverter.fromJsonString(loadResourceFile("./data.json"));`

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
