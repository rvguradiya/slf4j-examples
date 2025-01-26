# SLF4J Examples

This repository demonstrates key features of the **Simple Logging Facade for Java (SLF4J)**, including integration with popular logging frameworks and advanced logging techniques. Whether you're a beginner or an experienced Java developer, this project will help you understand and use SLF4J effectively.

---

## Table of Contents

1. [Introduction](#introduction)
2. [Features](#features)
3. [Repository Structure](#repository-structure)
4. [Setup Guide](#setup-guide)
5. [Examples Overview](#examples-overview)
6. [Contributing](#contributing)
7. [License](#license)

---

## Introduction

**SLF4J** (Simple Logging Facade for Java) provides a unified logging interface for Java applications. It allows developers to write logging code independent of the underlying logging framework (e.g., Logback, Log4j, Java Util Logging).

Key benefits:
- Simplifies switching between logging frameworks.
- Supports advanced logging features like **Markers** and **Mapped Diagnostic Contexts (MDC)**.
- Clean, simple API.

---

## Features

- Basic logging levels: `TRACE`, `DEBUG`, `INFO`, `WARN`, `ERROR`
- Parameterized logging
- Integration with popular frameworks:
    - Logback
    - Log4j2
    - Java Util Logging (JUL)
- Advanced features:
    - **Markers** for contextual logging
    - **MDC** for diagnostic context management
- Exception handling and logging best practices

---

## Repository Structure

```
slf4j-examples/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/example/
│   │   │   │   ├── basics/            # Basic SLF4J examples
│   │   │   │   ├── bindings/          # Integrating with logging frameworks
│   │   │   │   ├── advanced/          # Advanced SLF4J features
│   │   │   │   ├── configuration/     # Configuration files
│   ├── test/                          # Unit tests
├── lib/                               # Optional JAR files
├── docs/                              # Documentation
├── build.gradle                       # Gradle build file
├── pom.xml                            # Maven build file
├── README.md                          # Project documentation
├── .gitignore                         # Ignored files
```

---

## Setup Guide

### Prerequisites

- Java 8 or higher
- Gradle or Maven installed

### Clone the Repository
```bash
git clone https://github.com/rvguradiya/slf4j-examples.git
cd slf4j-examples
```

### Build the Project

#### Using Gradle:
```bash
gradle build
```

#### Using Maven:
```bash
mvn clean install
```

### Run Examples
Navigate to the `src/main/java/com/example` directory and run the desired examples using your IDE or a command-line tool.

---

## Examples Overview

### Basic Logging
- **HelloWorldLogger**: Simple example demonstrating SLF4J logging.
- **ParameterizedLogging**: Demonstrates how to use placeholders for efficient logging.
- **LoggingLevelsExample**: Explains the different logging levels.

### Framework Integrations
- **LogbackExample**: Integration with Logback.
- **Log4j2Example**: Integration with Log4j2.
- **JULExample**: Integration with Java Util Logging.

### Advanced Features
- **MDCExample**: Demonstrates how to use Mapped Diagnostic Contexts.
- **MarkerExample**: Shows how to use Markers for filtering and categorization.
- **ExceptionHandlingExample**: Best practices for logging exceptions.

---

## Contributing

Contributions are welcome! If you have additional examples or enhancements, feel free to submit a pull request.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m 'Add feature'`)
4. Push to your branch (`git push origin feature-name`)
5. Open a pull request

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

