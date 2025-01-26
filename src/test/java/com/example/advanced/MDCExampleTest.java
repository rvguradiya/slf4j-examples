package com.example.basics;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.MDC;

import static org.mockito.Mockito.*;

class MDCExampleTest {

    @Test
    void testMDCExampleMessages() {
        // Create a mock logger
        Logger mockLogger = mock(Logger.class);

        // Inject the mock logger into the MDCExample class (static field injection)
        MDCExampleTestHelper.setLogger(mockLogger);

        // Simulate MDC context
        MDC.put("userId", "12345");
        MDC.put("transactionId", "txn-67890");

        // Call the main method
        MDCExample.main(new String[]{});

        // Verify log messages
        verify(mockLogger).info("Starting MDC (Mapped Diagnostic Context) example.");
        verify(mockLogger).info("Performing transaction.");
        verify(mockLogger).debug("Transaction details: userId={} transactionId=txn-67890", "12345");
        verify(mockLogger).error(eq("Transaction failed for userId={} transactionId=txn-67890"), eq("12345"), eq("txn-67890"), any(RuntimeException.class));
        verify(mockLogger).info("Ending MDC example.");

        // Clear the MDC context
        MDC.clear();
    }
}

// Helper class for injecting the mock logger
class MDCExampleTestHelper {

    public static void setLogger(Logger mockLogger) {
        try {
            java.lang.reflect.Field loggerField = MDCExample.class.getDeclaredField("logger");
            loggerField.setAccessible(true);
            loggerField.set(null, mockLogger);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject mock logger", e);
        }
    }
}
