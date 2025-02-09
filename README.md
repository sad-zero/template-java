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


# License
Copyright (c) 2025 happy <br/>
This file can be used by MIT License. <br/>
See details at [LICENSE](./LICENSE)


