package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static Logger logger = LoggerFactory.getLogger("test");
    public static void main(String[] args)  {
        logger.info("Some text logged");
        MDC.put("key", "value");
        String value = MDC.get("key");
        logger.info("Got value: {}", value);
    }
}