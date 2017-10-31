package Exception.Task1;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {


        System.out.println("Enter size A");
        Scanner sc1 = new Scanner(System.in);
        int   a = sc1.nextInt();



        System.out.println("Enter size B");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        Square side = new Square(a, b);

        try{
            int sq = side.squareRectangle();
            System.out.println("Square of your rectangle is " +sq);

        }

        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            throw e;
        }

    }
}
