package Home_work1_Exersises_from_slide_47;

//  Write a program to display the pattern
//  like a pyramid using asterisk and each
//  row contain an odd number of asterisks.

import java.util.Scanner;

public class Home_Work1_Slide47_Task4 {
    public static void main(String Args[]) {

        Scanner sc = new Scanner(System.in);

        int mistake = 0; // this variable is needed for to verify if input incorrect , and return to input .
        int number_of_rows = 0 ;
        System.out.println("Input number of rows:");
        while ( mistake == 0) {
            if(sc.hasNextInt()) {
                number_of_rows = sc.nextInt();
                mistake = 1;
            } else {
                System.out.println("Entered value not correct");
            }
        }

        int number_of_asterisks;
        int spases_before_asterisks;

        for ( int i = 0 ; i <= number_of_rows ; i++) {

            number_of_asterisks = 2*i+1;
            spases_before_asterisks = number_of_rows-i;

            for ( int j = 0 ; j < spases_before_asterisks ; j++) {
                System.out.print(" ");
            }

            for ( int j = 0 ; j < number_of_asterisks ; j++) {
                System.out.print("*");
            }

            for ( int j = 0 ; j < spases_before_asterisks ; j++) {
                System.out.print(" ");
            }

            System.out.println("");  // transition to next row

        }


    }
}
