import java.util.Scanner;
enum Continents
{
    NorthAmerica, SouthAmerica, Europe, Africa, Asia, Oceania
}
public class Main {

    public static void main(String[] args) {
        Continents  continents;
        System.out.print("Enter country: ");
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        switch (country)
        {
            case "Ukraine":
                continents = Continents.Europe;
                System.out.println(country + " is it " + continents);
                break;
            case "Brasil":
                continents = Continents.SouthAmerica;
                System.out.println(country + " is it " + continents);
               break;
            case "Canada":
                continents = Continents.NorthAmerica;
                System.out.println(country + " is it " + continents);
               break;
            case "Juba":
                continents = Continents.Africa;
                System.out.println(country + " is it " + continents);
               break;
            case "Turkey":
                continents = Continents.Asia;
                System.out.println(country + " is it " + continents);
               break;
            case "Australia":
                continents = Continents.Oceania;
                System.out.println(country + " is it " + continents);
                break;
            default:
                System.out.println("There is no such country");



        }

    }
}
