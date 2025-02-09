<!--
Copyright (c) 2025 happy

This file can be used by MIT License.
See details at [LICENSE](/LICENSE)
-->
# Goal
This document guides how to install and run this project.

## Environments
| Name      | Version                       |
| --------- | ----------------------------- |
| OS        | Linux, Mac(default: Mac)      |
| Java      | >= 17(default: zulu-17)       |
| Gradle    | >= 8.12(default: 8.12.1)      |
| Container | Docker(Default: colima-0.8.1) |

## Setup
1. Clone this project in your machine.
2. Open the project in your IDE.
3. Customize template names as yours.
4. Start your project!

### Test container
If you use colima, podman, or other docker-compatible runtimes, check [this](https://java.testcontainers.org/supported_docker_environment/).

### Project-specific parameters
> You can change others except them below.

- [docker-compose.yaml](/docker-compose.yaml)
  - `service.image: {image_name: template-java}`
- [settings.gradle](/settings.gradle)
  - `rootProject.name: {project_name: babe}`
- [build.gradle](/build.gradle)
  - `group: {rootPackage: love.you}`
  - `ext.set('basePackage', {basePackage: love.you.babe}`
- [application.yaml](/src/main/resources/application.yaml)
  - `spring.application.name: {artifact: babe}`
- Source sets
  - `src/java/{basePackage: love/you/babe}`
  - `test/java/{basePackage: love/you/babe}`
  - `*.java`
    - Change packages to yours.
  - [fitness/LayoutTest.java](/src/test/java/love/you/babe/fitness/LayoutTest.java)
    - `String basePackage = {basePackage: love.you.babe}`

## Run
1. Go to project's root directory.
2. Run `./gradlew bootBuildImage --imageName={image_name: template-java}`
3. Run `docker compose up`.
