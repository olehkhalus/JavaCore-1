package Home_Work3;

//Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
//        surnames and initials
//        name
//        name, middle name and last name

import java.util.Scanner;
import java.util.regex.*;


public class Presentation7_Practical_Task2 {
    public static void main (String[] Args) {
        Scanner sc = new Scanner(System.in);

        //Input Data

        String surname = null;
        String name = null;
        String patronymic = null;

        System.out.println("Enter your surname");
        if (sc.hasNextLine()){
          surname = sc.nextLine();
        } else {
            System.out.println("Incorrect input");
        }
        Pattern p = Pattern.compile(surname);


        System.out.println("Enter your name");
        if (sc.hasNextLine()){
            name = sc.nextLine();
        } else {
            System.out.println("Incorrect input");
        }

        System.out.println("Enter your patronymic");
        if (sc.hasNextLine()){
            patronymic = sc.nextLine();
        } else {
            System.out.println("Incorrect input" );
        }

        // Output




        System.out.println(surname + name.substring(0,1)+patronymic.substring(0,1));




    }
}
