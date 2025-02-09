# Java Backend Boilerplate
This repository is designed to the boilerplate for Java Spring projects.

## Project Guidelines
- [CONTRIBUTING](docs/CONTRIBUTING.md)
- [INSTALLATION](docs/INSTALLATION.md)

## Project Targets
- People want to start API server based on Spring boot3 with JPA and postgresql quickly.
- People want to force specifications, contracts, and fitness functions.
  - See [Consumer-Driven Contract](https://microsoft.github.io/code-with-engineering-playbook/automated-testing/cdc-testing/)
  - See [API-First Design](https://www.postman.com/api-first/)
  - See [Evolutionary Architecture](https://evolutionaryarchitecture.com/)
- Development cycles based on XP.

## Project Structures
```plaintext
.
├── .github
│   ├── ISSUE_TEMPLATE
│   │   ├── bug_report.md
│   │   └── task-specification.md
│   └── PULL_REQUEST_TEMPLATE.md
├── .vscode
│   ├── eclipse-java-google-style.xml
│   └── settings.json
├── LICENSE
├── README.md
├── build.gradle
├── settings.gradle
├── config
│   └── checkstyle
│       ├── checkstyle.xml
│       └── supressions.xml
├── contracts
│   └── template.yaml
├── docker-compose.yaml
├── docs
│   ├── CODE_OF_CONDUCT.md
│   ├── CONTRIBUTING.md
│   └── INSTALLATION.md
└── src
    ├── main
    │   ├── java
    │   │   └── love
    │   │       └── you
    │   │           └── babe
    │   │               ├── BabeApplication.java
    │   │               ├── controller
    │   │               │   └── TemplateController.java
    │   │               ├── repository
    │   │               │   ├── entity
    │   │               │   │   └── TemplateEntity.java
    │   │               │   └── TemplateRepository.java
    │   │               └── service
    │   │                   ├── model
    │   │                   │   └── Template.java
    │   │                   └── TemplateService.java
    │   └── resources
    │       ├── application-local.yaml
    │       └── application.yaml
    └── test
        ├── java
        │   └── love
        │       └── you
        │           └── babe
        │               ├── contracts
        │               │   ├── TemplateBase.java
        │               │   └── TestcontainersConfiguration.java
        │               └── fitness
        │                   └── LayoutTest.java
        └── resources
            ├── application-test.yaml
            └── contracts
                └── template
                    └── contract.yaml
```
- [.github](/.github): Issue and PR templates.
- [.vscode](/.vscode): Visual Studio Code settings.
- [LICENSE](/LICENSE): The project's license.
- [build.gradle](/build.gradle): Project's build script.
- [settings.gradle][(/settings.gradle): Project's build script.
- [config/checkstyle](/config/checkstyle): Project's java style settings.
  - See [Checkstyle for Java gradle plugin](https://docs.gradle.org/current/userguide/checkstyle_plugin.html)
- [contracts](/contracts): API Specifications defined by OAS.
  - See [Open API Specification](https://swagger.io/specification/)
- [docker-compose.yaml](/docker-compose.yaml): Project's runtime script.
- [docs](/docs): Project's documents.
- [src/test/resources/contracts](/src/test/resources/contracts): API's integrational test specifications.
  - See [Spring Contract](https://spring.io/projects/spring-cloud-contract)
- [src/test/java/love/you/babe/contracts](/src/test/java/love/you/babe/contracts): Contract's base class for setup steps.

### Main dependencies
> See [details](/build.gradle)

| Name | Description |
| - | - |
| [spring-boot-starter-web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter) | API Server |
| [spring-boot-starter-data-jpa](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa) | ORM Framework |
| [spring-cloud-starter-contract-verifier](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-contract-verifier) | Integration Test Framework |
| [test container for Java](https://mvnrepository.com/artifact/org.testcontainers/junit-jupiter) | Isolated container |
| [openapi generator for gradle](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin) | API IF Generator |
| [docker](https://www.docker.com/) | Container environment |
| [docker compose](https://docs.docker.com/compose/) | Container stack management |
| [Postgresql](https://www.postgresql.org/) | Opensource RDB |
| [Gradle](https://gradle.org/) | Java build tool |

## Development Senario using this boilerplate.
1. Write API Specifications in [contracts](/contracts).
2. Run `./gradlew compileJava` to generate API IFs at `build/generated`.
3. Write API Contracts in [src/test/java/love/you/babe/contracts](/src/test/java/love/you/babe/contracts).
4. Run `./gradlew contractTest` to check whether integrational tests work.
5. Develop APIs by implementing generated API IFs.
6. Run `./gradlew check` to check whether all tests are passed.
7. Run `./gradlew bootBuildImage --imageName=template-java` to build server's image.
8. Run `docker compose up` to host the image.
9. Repeat `step 1-8` again.

# License
Copyright (c) 2025 happy <br/>
This file can be used by MIT License. <br/>
See details at [LICENSE](./LICENSE)


