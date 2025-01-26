package com.example.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String userName = "JohnDoe";
        int itemsInCart = 5;
        double totalPrice = 123.45;

        // Log with parameters
        logger.info("User {} has {} items in their cart with a total price of ${}", userName, itemsInCart, totalPrice);

        // Log with exception
        try {
            simulateError();
        } catch (Exception e) {
            logger.error("An error occurred while processing user {}'s cart.", userName, e);
        }
    }

    private static void simulateError() throws Exception {
        throw new Exception("Simulated exception: Database connection failed.");
    }
}
