package com.example.basics;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import static org.mockito.Mockito.*;

class MarkerExampleTest {

    @Test
    void testMarkerExampleMessages() {
        // Create a mock logger
        Logger mockLogger = mock(Logger.class);

        // Inject the mock logger into the MarkerExample class (static field injection)
        MarkerExampleTestHelper.setLogger(mockLogger);

        // Define markers
        Marker criticalMarker = MarkerFactory.getMarker("CRITICAL");
        Marker performanceMarker = MarkerFactory.getMarker("PERFORMANCE");

        // Call the main method
        MarkerExample.main(new String[]{});

        // Verify log messages
        verify(mockLogger).info("Starting Marker example.");
        verify(mockLogger).info(performanceMarker, "Performance testing started.");
        verify(mockLogger).warn(criticalMarker, "This is a CRITICAL warning.");
        verify(mockLogger).error(criticalMarker, "A critical error occurred in the system.");
        verify(mockLogger).info("Ending Marker example.");
    }
}

// Helper class for injecting the mock logger
class MarkerExampleTestHelper {

    public static void setLogger(Logger mockLogger) {
        try {
            java.lang.reflect.Field loggerField = MarkerExample.class.getDeclaredField("logger");
            loggerField.setAccessible(true);
            loggerField.set(null, mockLogger);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject mock logger", e);
        }
    }
}
