package HOME_WORK.com.example.homework.task;

import java.io.*;
import java.util.Scanner;

public class Tast1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A.");
        a = sc.nextInt();
        System.out.println("Enter number B.");
        b = sc.nextInt();

        System.out.println("Results A + B = " + (a + b) +
                           " Results A - B = " + (a - b) +
                           " Results A * B = " + (a * b) +
                           " Results A / B = " + (a / b));


    }
}
