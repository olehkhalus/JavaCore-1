package com.hw.hw8.practicaltasks;

public class ThreadSleepLab {
    
    public static void main(String[] args) {
        stdout("I study Java", 10, 1000);
        stdout("Hello, world!", 2000, "Peace is the peace", 3000, 5);
    }

    private static void stdout(String s, int count, long pause) {
        try {
            for (int i = 0; i < count; i++) {
                System.out.println(s);
                System.out.flush();
                Thread.sleep(pause);
            }
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    private static void stdout(String s1, long pause1, String s2, long pause2, int count) {
        try {
            for (int i = 0; i < count; i++) {
                System.out.println(s1);
                System.out.flush();
                Thread.sleep(pause1);
                System.out.println(s2);
                System.out.flush();
                Thread.sleep(pause2);
            }
        } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
        }
        System.out.println("My name is ...");
    }
}