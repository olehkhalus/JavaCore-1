import java.util.Scanner;

public class Answer {
    public static void main (String [] args) {
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.print("How are you? ");
        answer = sc.nextLine();
        System.out.print("You are " + answer);
    }

}
