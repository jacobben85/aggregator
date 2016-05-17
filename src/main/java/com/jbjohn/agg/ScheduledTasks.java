package com.jbjohn.agg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Scheduled tasks - process that are to run in the background
 */
@Component
public class ScheduledTasks {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(cron = "${cron.default.expression}")
    public void process() {
        LOGGER.info("Running scheduled tasks at : " + new Date());
    }
}
