package com.hw.hw8.practicaltasks;

import java.util.stream.*;

public class JoinTest {
    
    public static void main(String[] args) throws Exception {
        Runnable stdout0 = () -> {
            IntStream.range(0, 5).forEach($ -> System.out.printf("stdout-0 %s%n", Thread.currentThread().getName()));
        };

        Thread t0 = new Thread(stdout0);

        Runnable stdout1 = () -> {
            IntStream.range(0, 5).forEach($ -> System.out.printf("stdout-1 %s%n", Thread.currentThread().getName()));
        };

        Thread t1 = new Thread(stdout1);

        Runnable stdout2 = () -> {
            IntStream.range(0, 5).forEach($ -> System.out.printf("stdout-2 %s%n", Thread.currentThread().getName()));
        };

        Thread t2 = new Thread(stdout2);

        t0.start();
        t1.start();
        t2.join();
        t2.start();
    }
}


