package com.homework.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Task {

    public int runCalc() {
        int result = 0;
        int a = 0;
        int b = 0;
        char operation = ' ';
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a first number");
            String input = scanner.next();
            if (validNumber(input))
            {
                a = Integer.parseInt(input);
                break;
            } System.out.println("Not a correct input");
        }

        while (true) {
            System.out.println("Enter a last number");
            String input = scanner.next();
            if (validNumber(input)) {
                b = Integer.parseInt(input);
                break;
            } System.out.println("Not a correct input");
        }
        System.out.println("Enter operation");
        operation = scanner.next().charAt(0);
        result = calc(a, b, operation);
        System.out.println(result);
        return result;
    }

    private int calc(int a, int b, char operation) {
        int result = 0;
        try {
            switch (operation) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                default: throw new IllegalArgumentException("Incorrect choice! Try again");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private boolean validNumber(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public void howAreYou() {
        String name = null;
        System.out.println("How are you");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("You are " + name);
    }

    public void random() {
        Random random = new Random(System.currentTimeMillis());
        int m = random.nextInt(21) - 10;
        int n = 0;
        if (m <= 0) {
            n = 1;
        } else {
            n = 0;
        }
        System.out.println("N = " + n + " , M = " + m);
    }

    public void sum() {
        int j = 0;
        for (int i = 0; i <= 9; i++) {
            j = i + i;
        }
        System.out.println("Sum = " + j);
    }

    public void pyramid(int h) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h * 2; j++) {
                if (j > h - 2 - i && j < h + i) {
                    builder.append("*");
                } else if (j < h * 2 - 1) {
                    builder.append(" ");
                }
            }
            if (i < h - 1) {
                builder.append(System.getProperty("line.separator"));
            }
        }
        System.out.println(builder);
    }
}
