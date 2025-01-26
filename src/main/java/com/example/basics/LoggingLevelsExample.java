package com.example.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingLevelsExample {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingLevelsExample.class);

    public static void main(String[] args) {
        logger.trace("This is a TRACE level message: Used for fine-grained debug information.");
        logger.debug("This is a DEBUG level message: Useful during development for debugging.");
        logger.info("This is an INFO level message: General operational information.");
        logger.warn("This is a WARN level message: Indicates potential issues or warnings.");
        logger.error("This is an ERROR level message: Indicates serious errors that need attention.");
    }
}
