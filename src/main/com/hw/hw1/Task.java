package com.hw.hw1;

import java.util.Scanner;

public class Task {
    
    private static Scanner input = new Scanner(System.in);
    
     // very simple calc
    public static void calc() {        
        System.out.println("Enter the first operand, and then press Enter");
        int a = input.nextInt();
        System.out.println("Enter the second operand, and then press Enter");
        int b = input.nextInt();
        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.printf("a * b = %d%n", a * b);
        System.out.printf("a / b = %.2f%n",  (double) a / b );
    }
    
    // takes input then prints it to the console 
    public static void reader() {
        System.out.println("How're you?");
        String answer = input.nextLine();
        System.out.println("You're " + answer);
    }
    
    // conditionaly set n's value 
    public static int setVal(int m) {
        int n = m > 0 ? 1 : m < 0 ? -1 : 0; 
        return n;
    }
    
    // adds up the sum of the first 10 natural numbers
    public static int addUp(int n) {
        if (n < 1) {
            return n;
        } else {
            return n + addUp(n - 1);
        }           
      }
}