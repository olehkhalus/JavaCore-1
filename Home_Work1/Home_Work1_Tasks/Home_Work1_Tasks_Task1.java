package Home_Work1_Tasks;

//Define integer variables a and b. Read values a and b from Console and calculate: a + b, a - b, a * b, a / b. Output obtained results.

import java.util.Scanner;

public class Home_Work1_Tasks_Task1 {
    public static void main(String Args[]){
        int a = 0; // both a and b is equated to zero because operations in row 29-31 and 38 need guaranteed input of a and b , what can be incorrect.
        int b = 0;
        int mistake = 0; // this variable is needed for to verify if input incorrect , and return to input .
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value a :");
        while ( mistake == 0) {
            if(sc.hasNextInt()) {
                a = sc.nextInt();
                mistake = 1;
            } else {
                System.out.println("Entered value not correct");
            }
        }
        System.out.println("Enter integer value b :");
        while ( mistake == 1) {
            if(sc.hasNextInt()) {
                b = sc.nextInt();
                mistake = 2;
            } else {
                System.out.println("Entered value not correct");
            }
        }
        int sum = a+b;
        int difference = a-b;
        int multiplication = a*b;
        System.out.println("a+b = "+sum);
        System.out.println("a-b = "+difference);
        System.out.println("a*b = "+multiplication);

        if (b != 0) {                                  // check if b equal to zero
            double division = (double)a/b;
            System.out.println("a/b = "+division);
        } else {
            System.out.println("a/b =can not divide by zero");
        }

    }
}
