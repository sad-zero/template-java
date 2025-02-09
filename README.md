# Java Backend Boilerplate
This repository is designed to the boilerplate for Java Spring projects.

## Project Guidelines
- [CONTRIBUTING](docs/CONTRIBUTING.md)
- [INSTALLATION](docs/INSTALLATION.md)

## Project Targets
- People want to start API server based on Spring boot3 quickly.
- People want to force specifications, contracts, and fitness functions.
  - See [Consumer-Driven Contract](https://microsoft.github.io/code-with-engineering-playbook/automated-testing/cdc-testing/)
  - See [API-First Design](https://www.postman.com/api-first/)
  - See [Evolutionary Architecture](https://evolutionaryarchitecture.com/)

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

# License
Copyright (c) 2025 happy <br/>
This file can be used by MIT License. <br/>
See details at [LICENSE](./LICENSE)


