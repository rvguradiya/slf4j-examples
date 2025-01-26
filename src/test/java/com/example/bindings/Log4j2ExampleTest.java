package com.example.basics;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.slf4j.Logger;

class Log4j2ExampleTest {

    @Test
    void testLog4j2ExampleMessages() {
        // Create a mock logger
        Logger mockLogger = mock(Logger.class);

        // Inject the mock logger into the Log4j2Example class (static field injection)
        Log4j2ExampleTestHelper.setLogger(mockLogger);

        // Call the main method
        Log4j2Example.main(new String[]{});

        // Verify log messages
        verify(mockLogger).info("Starting Log4j2 example.");
        verify(mockLogger).debug("This is a debug message to demonstrate Log4j2 integration.");
        verify(mockLogger).warn("This is a warning message.");
        verify(mockLogger).error("This is an error message.");
        verify(mockLogger).info("The operation '{}' completed successfully. Items processed: {}.", "data processing", 100);
        verify(mockLogger).info("Ending Log4j2 example.");
    }
}

// Helper class for injecting the mock logger
class Log4j2ExampleTestHelper {

    public static void setLogger(Logger mockLogger) {
        try {
            java.lang.reflect.Field loggerField = Log4j2Example.class.getDeclaredField("logger");
            loggerField.setAccessible(true);
            loggerField.set(null, mockLogger);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject mock logger", e);
        }
    }
}
