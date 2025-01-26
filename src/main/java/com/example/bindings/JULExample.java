package com.example.bindings;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JULExample {

    // Create a logger instance for this class
    private static final Logger logger = Logger.getLogger(JULExample.class.getName());

    public static void main(String[] args) {
        logger.info("Starting JUL (Java Util Logging) example.");

        logger.log(Level.FINE, "This is a fine-level debug message.");
        logger.warning("This is a warning message.");
        logger.severe("This is a severe error message.");

        // Example of parameterized logging with String.format
        String task = "file upload";
        int filesProcessed = 15;
        logger.info(String.format("The task '%s' completed successfully. Files processed: %d.", task, filesProcessed));

        logger.info("Ending JUL example.");
    }
}
