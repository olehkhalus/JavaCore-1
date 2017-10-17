package main.java;

import java.util.Scanner;
/*Enter the name of the country.
Print the name of the continent.
(Declare enum with names of continents)

 */
public enum Contynent {

    Europe, Asia, Africa, Australia, Antarctica ,America;
}
class Main {
    public static void main(String[] args) {
        Contynent conti;
        System.out.println("Choose the country:  " +
                "\n 1:England" +
                "\n 2:China" +
                "\n 2:Egypt"
        );
        Scanner sc = new Scanner(System.in);
        int country = sc.nextInt();
        switch (country)
        {
            case 1:
                conti = Contynent.Europe;
                System.out.println("England country is on the continent " + conti);
                break;
            case 2:
                conti = Contynent.Asia;
                System.out.println("China country is on the continent  " + conti);
                break;
            case 3:
                conti = Contynent.Africa;
                System.out.println("Egypt country is on the continent " + conti);
                break;
            default:
                System.out.println("I don't now this country");



        }
    }
}
