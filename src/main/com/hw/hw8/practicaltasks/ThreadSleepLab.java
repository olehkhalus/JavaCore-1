package com.hw.hw8.practicaltasks;

public class ThreadSleepLab {
    
    public static void main(String[] args) {
        stdout("I study Java", 10, 1000);
        stdout("Hello, world!", 5, 2000);
        stdout("Peace is the peace", 5, 3000);
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
}