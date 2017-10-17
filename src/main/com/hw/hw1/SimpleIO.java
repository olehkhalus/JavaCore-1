package com.hw.hw1;

import static java.lang.Math.*;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class SimpleIO {
    
    private static Scanner input = new Scanner(System.in);

    // calculates area and perimeter of a circle 
    public static void calcArea() {
        System.out.println("Enter radius of a circle, and then press Return key");
        double radius = input.nextDouble();
        System.out.printf("Area ≈ %.5g%n", PI * 2 * radius);
        System.out.printf("Circumference ≈ %.5g%n", PI * pow(radius, 2));   
    }
    
    // takes input then prints it to the console
    public static void reader() {
        System.out.println("What's your name?");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.printf("Name: %s%nAge: %d%n", name, age);
    }
    
    // determines whether a year is a leap year
    public static boolean isLeapYear(int year) {
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        return cal.isLeapYear(year); 
    }
    
    public static void printTriangle(char symbol, int rows) {
        int tmp = 0;
        for (int i = 1; i <= rows; ++i, tmp = 0) {
            for (int space = 1; space <= rows - i; ++space) 
                System.out.print("  ");
            while (tmp != 2 * i - 1) {
                System.out.print(symbol + " ");
                ++tmp;
            }
            System.out.println();
        }
    }
}
