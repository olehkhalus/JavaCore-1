package homework2;

public class MainHomeWork2 {
    public static void main (String[] args){
        Employe employe = new Employe("taras",8,3);
       // employe.setName("taras");
       // employe.setRate(8.2);
       // employe.setHours(8.5);
        Employe employe2 = new Employe("vova",8,7);
       // employe2.setName("vova");
       // employe2.setRate(8);
       // employe2.setHours(7);
        Employe employe3 = new Employe("petya",8,15);
        //employe2.setName("petya");
        //employe2.setRate(8);
       // employe2.setHours(15);

        System.out.println(employe.getName());
        System.out.println(employe.salary());
        System.out.println(employe);
        System.out.println(employe.bonuses());
        System.out.println(employe.number);

    }
}
