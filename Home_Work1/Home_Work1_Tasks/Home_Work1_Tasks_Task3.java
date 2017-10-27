package Home_Work1_Tasks;

//Define integer variable m and set the value of variable n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0.

import java.util.Scanner;

public class Home_Work1_Tasks_Task3 {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int n;
        int mistake = 0;
        System.out.println("Enter integer value m :");
        while ( mistake == 0) {
            if(sc.hasNextInt()) {
                m = sc.nextInt();
                mistake = 1;
            } else {
                System.out.println("Entered value not correct");
            }
        }
        if ( m > 0) {
            n = 1;
            System.out.println(n); // display on screen to see if any mistake
        } else if ( m == 0 ) {
            n = 0;
            System.out.println(n);
        } else {
            n = -1;
            System.out.println(n);
        }
    }

}
