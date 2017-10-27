package com.hw.hw8.practicaltasks;

import java.util.stream.*;

public class JoinTest {
    
    public static void main(String[] args) throws Exception {
        Runnable stdout1 = () -> {
            IntStream.range(0, 5).forEach($ -> System.out.printf("Stdout-0 %s%n", Thread.currentThread().getName()));
        };
        Thread t1= new Thread(stdout1);

        Runnable stdout2 = () -> {
            IntStream.range(0, 5).forEach($ -> System.out.printf("Stdout-1 %s%n", Thread.currentThread().getName()));
        };
        Thread t2 = new Thread(stdout2);

        Runnable stdout3 = () -> {
            IntStream.range(0, 5).forEach($ -> System.out.printf("Stdout-2 %s%n", Thread.currentThread().getName()));
        };
        Thread t3 = new Thread(stdout3);

        t1.start();
        t2.start();
        t2.join();
        t3.start();
    }
}


