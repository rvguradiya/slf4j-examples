package com.example.advanced;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class MarkerExample {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(MarkerExample.class);

    public static void main(String[] args) {
        // Define custom markers
        Marker criticalMarker = MarkerFactory.getMarker("CRITICAL");
        Marker performanceMarker = MarkerFactory.getMarker("PERFORMANCE");

        logger.info("Starting Marker example.");

        logger.info(performanceMarker, "Performance testing started.");
        logger.warn(criticalMarker, "This is a CRITICAL warning.");
        logger.error(criticalMarker, "A critical error occurred in the system.");

        logger.info("Ending Marker example.");
    }
}
