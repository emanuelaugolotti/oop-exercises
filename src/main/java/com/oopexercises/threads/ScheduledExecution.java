package com.oopexercises.threads;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.time.LocalDateTime.now;

public class ScheduledExecution {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() ->
                System.out.println(LocalTime.now() + ": Hello!"), 0L, 1L, TimeUnit.SECONDS);
    }
}
