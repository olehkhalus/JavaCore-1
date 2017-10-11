package com.homework.lesson1;

public class Main {

    public static void main(String[] args) {
        Task homeWork1 = new Task();
        /*  Define integer variables a and b. Read values a and b from Console and
            calculate: a + b, a - b, a * b, a / b. Output obtained results./
         */
        homeWork1.runCalc();

        /* Output question “How are you?“. Define string variable answer.
           Read the value answer and output: “You are (answer)"./
         */
        homeWork1.howAreYou();

        /* Define integer variable m and set the value of variable n is 1 when m
           is larger than 0, 0 when m is 0 and -1 when m is less than 0. /
         */
        homeWork1.random();

        /* Write the code to find the sum of first 10 natural numbers.*/
        homeWork1.sum();

        /* Write a program to display the pattern like a pyramid using asterisk and each
           row contain an odd number of asterisks.*/
        homeWork1.pyramid(4);
    }
}
