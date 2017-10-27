package Home_Work3;

//Enter the two variables of type String.
//Determine whether the first variable substring second.
// For example, if you typed «IT» and «IT Academy» you must receive true.

import java.util.Scanner;
import java.util.regex.*;

public class Presentation7_Practical_Task1 {
    public static void main( String[] Args ){

        // Input

        String FirstWord = null;
        String SecondWord = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input first word");
        if (sc.hasNextLine()){
            FirstWord = sc.nextLine();
        } else {
            System.out.println("Incorrect input");
        }

        System.out.println("Input second word");
        if (sc.hasNextLine()){
            SecondWord = sc.nextLine();
        } else {
            System.out.println("Incorrect input");
        }

        // Compare inputted words

        Pattern p = Pattern.compile(SecondWord);
        Matcher m = p.matcher(FirstWord);

        boolean answer = m.find();

        System.out.println(answer);

    }
}
