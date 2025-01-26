package com.example.basics;

import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.mockito.Mockito.*;

class JULExampleTest {

    @Test
    void testJULExampleMessages() {
        // Create a mock logger
        Logger mockLogger = mock(Logger.class);

        // Inject the mock logger into the JULExample class (static field injection)
        JULExampleTestHelper.setLogger(mockLogger);

        // Call the main method
        JULExample.main(new String[]{});

        // Verify log messages
        verify(mockLogger).info("Starting JUL (Java Util Logging) example.");
        verify(mockLogger).log(Level.FINE, "This is a fine-level debug message.");
        verify(mockLogger).warning("This is a warning message.");
        verify(mockLogger).severe("This is a severe error message.");
        verify(mockLogger).info("The task 'file upload' completed successfully. Files processed: 15.");
        verify(mockLogger).info("Ending JUL example.");
    }
}

// Helper class for injecting the mock logger
class JULExampleTestHelper {

    public static void setLogger(Logger mockLogger) {
        try {
            java.lang.reflect.Field loggerField = JULExample.class.getDeclaredField("logger");
            loggerField.setAccessible(true);
            loggerField.set(null, mockLogger);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject mock logger", e);
        }
    }
}
