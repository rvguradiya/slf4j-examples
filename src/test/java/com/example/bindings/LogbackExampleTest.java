package com.example.basics;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.slf4j.Logger;

class LogbackExampleTest {

    @Test
    void testLogbackExampleMessages() {
        // Create a mock logger
        Logger mockLogger = mock(Logger.class);

        // Inject the mock logger into the LogbackExample class (static field injection)
        LogbackExampleTestHelper.setLogger(mockLogger);

        // Call the main method
        LogbackExample.main(new String[]{});

        // Verify log messages
        verify(mockLogger).info("Starting Logback example.");
        verify(mockLogger).debug("This is a debug message to showcase Logback's capabilities.");
        verify(mockLogger).warn("This is a warning message.");
        verify(mockLogger).error("This is an error message.");
        verify(mockLogger).info("User {} has logged in successfully.", "Alice");
        verify(mockLogger).info("Ending Logback example.");
    }
}

// Helper class for injecting the mock logger
class LogbackExampleTestHelper {

    public static void setLogger(Logger mockLogger) {
        try {
            java.lang.reflect.Field loggerField = LogbackExample.class.getDeclaredField("logger");
            loggerField.setAccessible(true);
            loggerField.set(null, mockLogger);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject mock logger", e);
        }
    }
}
