package com.oopexercises1.threads;

public class StartStop extends Thread {
    public StartStop(String name) {
        super(name);
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println(getName() + " started");
        while (!interrupted()) {
            long now = System.currentTimeMillis() - start;
            System.out.println(getName() + " running since " + now + " ms");
        }
        System.out.println(getName() + " terminated");
    }

    public static void main(String[] args) throws InterruptedException {
        StartStop child1 = new StartStop("T1");
        StartStop child2 = new StartStop("T2");

        child1.start();
        child2.start();

        Thread.sleep(100L);

        child1.interrupt();
        child2.interrupt();

        child1.join();
        child2.join();
    }
}
