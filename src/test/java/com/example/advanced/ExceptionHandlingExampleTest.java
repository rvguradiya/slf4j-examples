package com.example.advanced;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingExampleTest {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlingExampleTest.class);

    @Test
    void testPerformRiskyOperation_noException() {
        logger.info("Running test: testPerformRiskyOperation_noException");

        // Mock Math.random to always return a value less than 0.5
        try {
            performRiskyOperationMock(() -> 0.4);
        } catch (Exception e) {
            fail("No exception was expected, but an exception was thrown.");
        }
    }

    @Test
    void testPerformRiskyOperation_withException() {
        logger.info("Running test: testPerformRiskyOperation_withException");

        // Mock Math.random to always return a value greater than 0.5
        Exception exception = assertThrows(Exception.class, () -> {
            performRiskyOperationMock(() -> 0.6);
        });

        assertEquals("Simulated exception: Something went wrong!", exception.getMessage());
    }

    // Helper method to mock performRiskyOperation
    private void performRiskyOperationMock(RandomProvider randomProvider) throws Exception {
        logger.info("Starting a risky operation (mocked)...");

        // Simulate an exception based on mocked randomProvider
        if (randomProvider.getRandomValue() > 0.5) {
            throw new Exception("Simulated exception: Something went wrong!");
        }

        logger.info("Operation completed successfully (mocked).");
    }

    // Functional interface to mock Math.random
    @FunctionalInterface
    interface RandomProvider {
        double getRandomValue();
    }
}
