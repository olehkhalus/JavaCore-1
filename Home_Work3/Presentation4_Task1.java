//Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)

package Home_Work3;

import java.util.Scanner;

public class Presentation4_Task1 {
    public enum Continent {
        North_America , South_America , Europe , Asia , Africa , Australia
    }
    public static void main (String[] Args) {
        String country = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input country name");
        if (sc.hasNextLine()){
            country = sc.nextLine();
        } else {
            System.out.println("Incorrect name");
        }
        Continent continent;
        switch (country) {
            case "Canada":
            case "Mexico":
                continent = Continent.North_America;
                System.out.println(continent);
                break;
            case "Brasil":
            case "Argentina":
                continent = Continent.South_America;
                System.out.println(continent);
                break;
            case "Ukraine":
            case "Germany":
                continent = Continent.Europe;
                System.out.println(continent);
                break;
            case "China":
            case "India":
                continent = Continent.Asia;
                System.out.println(continent);
                break;
            case "Niger":
            case "Nigeria":
                continent = Continent.Africa;
                System.out.println(continent);
                break;
            case "Australia":
                continent = Continent.Australia;
                System.out.println(continent);
                break;
            default:
                System.out.println("Unknown country");
                break;
        }
    }
}
