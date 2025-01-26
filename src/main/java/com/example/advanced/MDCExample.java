package com.example.advanced;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class MDCExample {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(MDCExample.class);

    public static void main(String[] args) {
        // Set MDC context values
        MDC.put("userId", "12345");
        MDC.put("transactionId", "txn-67890");

        logger.info("Starting MDC (Mapped Diagnostic Context) example.");

        try {
            performTransaction();
        } finally {
            // Clear the MDC context
            MDC.clear();
        }

        logger.info("Ending MDC example.");
    }

    private static void performTransaction() {
        logger.info("Performing transaction.");
        logger.debug("Transaction details: userId={} transactionId={}", MDC.get("userId"), MDC.get("transactionId"));

        // Simulate an error during the transaction
        try {
            throw new RuntimeException("Simulated transaction failure");
        } catch (Exception e) {
            logger.error("Transaction failed for userId={} transactionId={}", MDC.get("userId"), MDC.get("transactionId"), e);
        }
    }
}
