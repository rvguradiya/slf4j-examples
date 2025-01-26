package com.example.basics;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.slf4j.Logger;

class ParameterizedLoggingTest {

    @Test
    void testParameterizedLoggingMessages() {
        // Create a mock logger
        Logger mockLogger = mock(Logger.class);

        // Inject the mock logger into the ParameterizedLogging class (static field injection)
        ParameterizedLoggingTestHelper.setLogger(mockLogger);

        // Call the main method
        ParameterizedLogging.main(new String[]{});

        // Verify the parameterized log message
        verify(mockLogger).info("User {} has {} items in their cart with a total price of ${}", "JohnDoe", 5, 123.45);

        // Verify the exception log message
        verify(mockLogger).error(eq("An error occurred while processing user {}'s cart."), eq("JohnDoe"), any(Exception.class));
    }
}

// Helper class for injecting the mock logger
class ParameterizedLoggingTestHelper {

    public static void setLogger(Logger mockLogger) {
        try {
            java.lang.reflect.Field loggerField = ParameterizedLogging.class.getDeclaredField("logger");
            loggerField.setAccessible(true);
            loggerField.set(null, mockLogger);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject mock logger", e);
        }
    }
}
