package com.example.basics;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.slf4j.Logger;

class LoggingLevelsExampleTest {

    @Test
    void testLoggingLevelsMessages() {
        // Create a mock logger
        Logger mockLogger = mock(Logger.class);

        // Inject the mock logger into the LoggingLevelsExample class (static field injection)
        LoggingLevelsExampleTestHelper.setLogger(mockLogger);

        // Call the main method
        LoggingLevelsExample.main(new String[]{});

        // Verify all logging level messages
        verify(mockLogger).trace("This is a TRACE level message: Used for fine-grained debug information.");
        verify(mockLogger).debug("This is a DEBUG level message: Useful during development for debugging.");
        verify(mockLogger).info("This is an INFO level message: General operational information.");
        verify(mockLogger).warn("This is a WARN level message: Indicates potential issues or warnings.");
        verify(mockLogger).error("This is an ERROR level message: Indicates serious errors that need attention.");
    }
}

// Helper class for injecting the mock logger
class LoggingLevelsExampleTestHelper {

    public static void setLogger(Logger mockLogger) {
        try {
            java.lang.reflect.Field loggerField = LoggingLevelsExample.class.getDeclaredField("logger");
            loggerField.setAccessible(true);
            loggerField.set(null, mockLogger);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject mock logger", e);
        }
    }
}
