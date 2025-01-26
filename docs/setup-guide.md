# Setup Guide: SLF4J Examples

Follow this guide to set up and run the SLF4J examples provided in this repository. This document will cover the prerequisites, installation steps, and how to execute the examples.

---

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- **Java Development Kit (JDK)**
    - Version: 8 or higher
    - Verify installation:
      ```bash
      java -version
      ```

- **Build Tool**
    - **Maven** or **Gradle**
    - Verify installation:
      ```bash
      mvn -version  # For Maven
      gradle -v     # For Gradle
      ```

- **Git**
    - To clone the repository.
    - Verify installation:
      ```bash
      git --version
      ```

---

## Clone the Repository

1. Open a terminal or command prompt.
2. Clone the repository using the following command:
   ```bash
   git clone https://github.com/your-username/slf4j-examples.git
   ```
3. Navigate to the project directory:
   ```bash
   cd slf4j-examples
   ```

---

## Build the Project

### Using Maven

1. Compile and package the project:
   ```bash
   mvn clean install
   ```
2. Verify the build output for errors.

### Using Gradle

1. Build the project:
   ```bash
   gradle build
   ```
2. Verify the build output for errors.

---

## Run Examples

### Running from an IDE

1. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
2. Navigate to the `src/main/java/com/example` directory.
3. Run the desired example class (e.g., `HelloWorldLogger.java`).

### Running from the Command Line

1. Navigate to the `target` or `build` directory (depending on the build tool used).
2. Use the `java` command to run the desired class. For example:
   ```bash
   java -cp target/slf4j-examples-1.0-SNAPSHOT.jar com.example.basics.HelloWorldLogger
   ```

---

## Configuration

### Logging Framework Configurations

This repository includes configuration files for different logging frameworks:

- **Logback**: `src/main/java/com/example/configuration/LogbackConfig.xml`
- **Log4j2**: `src/main/java/com/example/configuration/Log4j2Config.xml`
- **Java Util Logging (JUL)**: `application.properties`

### Modify Configuration

1. Open the relevant configuration file for your desired logging framework.
2. Customize logging levels, output format, and log file paths as needed.
3. Save your changes.

---

## Troubleshooting

- **Build Fails**: Ensure all dependencies are downloaded correctly. Run `mvn dependency:resolve` or `gradle dependencies` to verify.
- **Class Not Found**: Verify the `classpath` includes the required dependencies.
- **Log Messages Not Appearing**: Ensure the correct logging framework is configured.

---

## Additional Resources

- [SLF4J Official Documentation](http://www.slf4j.org/)
- [Logback Documentation](https://logback.qos.ch/documentation.html)
- [Log4j2 Documentation](https://logging.apache.org/log4j/2.x/manual/)

For further assistance, feel free to open an issue or contribute to this repository!

