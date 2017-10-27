package Home_work1_Exersises_from_slide_47;

// Define string variable name and integer value age. Output question "What is your name?" read the
// value name and output next question: "How old are you?" read the value age and write whole information.

import java.util.Scanner;

public class Home_Work1_Slide47_Task2 {
    public static void main(String Args[]) {

        Scanner sc = new Scanner(System.in);

        String name = "no input" ;
        int age ;

        System.out.println("Input your name :");
        if(sc.hasNextLine()) {
            name = sc.nextLine();
        } else {
            System.out.println("Entered value not correct");
        }

        System.out.println("Input your age :");
        if(sc.hasNextInt()) {
            age = sc.nextInt();
            System.out.println("Your name "+name);
            System.out.println("Your age "+age);
        } else {
            System.out.println("Entered value not correct");
        }
    }
}
