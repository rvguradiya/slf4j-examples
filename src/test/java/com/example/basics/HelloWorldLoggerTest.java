package com.example.basics;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.slf4j.Logger;

class HelloWorldLoggerTest {

    @Test
    void testHelloWorldLoggerMessages() {
        // Create a mock logger
        Logger mockLogger = mock(Logger.class);

        // Inject the mock logger into the HelloWorldLogger (static field injection)
        HelloWorldLoggerTestHelper.setLogger(mockLogger);

        // Call the main method
        HelloWorldLogger.main(new String[]{});

        // Verify the correct log messages were logged
        verify(mockLogger).info("Hello, World! This is an info message.");
        verify(mockLogger).debug("Debugging the HelloWorldLogger class.");
        verify(mockLogger).warn("Warning: Check your configuration.");
        verify(mockLogger).error("Error: Something went wrong.");
    }
}

// Helper class for injecting the mock logger
class HelloWorldLoggerTestHelper {

    public static void setLogger(Logger mockLogger) {
        try {
            java.lang.reflect.Field loggerField = HelloWorldLogger.class.getDeclaredField("logger");
            loggerField.setAccessible(true);
            loggerField.set(null, mockLogger);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject mock logger", e);
        }
    }
}
