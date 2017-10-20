package homework3;

import java.util.Scanner;
import java.lang.String;

public class Enum {
    enum Continents {
        EUROPE, ASIA, NORTHAMERICA, SOUTHAMERICA;
    }

    public static void main(String[] args) {

        System.out.println("enter the country  " +
                "\n 1:Ukraine" +
                "\n 2:France" +
                "\n 3:Poland" +
                "\n 4:China" +
                "\n 5:India" +
                "\n 6:Japan" +
                "\n 7:USA" +
                "\n 8:Canada" +
                "\n 9:Mexico"
        );
        Scanner sc = new Scanner(System.in);
        int countries = sc.nextInt();
        Continents continents;
        switch (countries) {
            case 1:
            case 2:
            case 3:
                continents = Continents.EUROPE;
                System.out.println("This is country of continent " + continents);
                break;
            case 4:
            case 5:
            case 6:
                continents = Continents.ASIA;
                System.out.println("This is country of continent " + continents);
                break;
            case 7:
            case 8:
            case 9:
                continents = Continents.NORTHAMERICA;
                System.out.println("This is country of continent " + continents);
                break;
            default:
                System.out.println("This country does not consist in each other continent");
        }
    }
}
