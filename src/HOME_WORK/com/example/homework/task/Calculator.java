package HOME_WORK.com.example.homework.task;

import java.util.Scanner;

public class Calculator {


    private static Scanner read;

    public static void main (String[] args){

        read = new Scanner(System.in);

        int a;
        int b;
        String operator;

        System.out.print(">> ");

        a = read.nextInt();
        operator = read.next();
        b = read.nextInt();

        if (operator.equals("*")){
            System.out.println("= " + (a * b));
        }
        if (operator.equals("/")){
            System.out.println("= " + (a / b));
        }
        if (operator.equals("+")){
            System.out.println("= " + (a + b));
        }
        if (operator.equals("-")){
            System.out.println("= " + (a - b));
        }
    }
}