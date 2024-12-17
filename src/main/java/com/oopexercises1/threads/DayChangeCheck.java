package com.oopexercises1.threads;

import java.time.Duration;
import java.time.LocalDate;

public class DayChangeCheck extends Thread {

    public DayChangeCheck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        LocalDate nowDate = LocalDate.now();
        int dayMonth = nowDate.getDayOfMonth();
        System.out.println("The day of the month is: " + dayMonth);
        while (!interrupted()) {
            try {
                Thread.sleep(Duration.ofMinutes(15));
            } catch (InterruptedException ignored) {
            }
            nowDate = LocalDate.now();
            int newDayMonth = nowDate.getDayOfMonth();
            if (newDayMonth != dayMonth) {
                System.out.println("The day of the month is changed! Day of the month: " + newDayMonth);
                dayMonth = newDayMonth;
            }
            else {
                System.out.println("The day of the month is not changed!");
            }
        }
    }

    public static void main(String[] args) {
        DayChangeCheck child = new DayChangeCheck("T1");
        child.start();
    }
}