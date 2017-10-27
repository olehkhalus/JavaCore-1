package Home_Work1_Tasks;

//Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".

import java.util.Scanner;

public class Home_Work1_Tasks_Task2 {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        String answer ;
        int mistake = 0;
        System.out.println("How are you?");
        while ( mistake == 0) {
            if(sc.hasNextLine()) {
                answer = sc.nextLine();
                System.out.println("You are "+answer);
                mistake = 1;
            } else {
                System.out.println("Entered value not correct");
            }
        }
    }
}
