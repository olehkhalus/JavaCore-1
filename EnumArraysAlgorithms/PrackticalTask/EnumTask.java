package EnumArraysAlgorithms.PrackticalTask;

/**
 * Created by golov on 17.10.2017.
 */
public class EnumTask {

   public enum Continent {
       ASIA, AFRICA, ANTARCTICA, AUSTRALIA, EUROPE, NORTH_AMERRICA, SOUTH_AMERICA
   }

    public static void main(String[] args) {

        Continent continent;
        String country = "Ukraine";

        switch (country){
            case "Ukraine":
                continent = Continent.EUROPE;
                break;
            case "USA":
                continent = Continent.NORTH_AMERRICA;
                break;
            case "Egypt":
                continent = Continent.AFRICA;
                break;

             default:
                 System.out.println("Something else");


        }
    }


}
