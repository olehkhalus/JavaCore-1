package Home_work1_Exersises_from_slide_47;

// Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.

import java.util.Scanner;

public class Home_Work1_Slide47_Task1 {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        double flower_bad_radius ;
        System.out.println("Input radius of flower bad :");
        if(sc.hasNextDouble()) {
            flower_bad_radius = sc.nextDouble();
            double flower_bad_area = Math.PI*Math.pow( flower_bad_radius, 2);
            double flower_bad_perimeter = 2*Math.PI*flower_bad_radius;
            System.out.println("Flower bad area = "+flower_bad_area);
            System.out.println("Flower bad perimeter = "+flower_bad_perimeter);
        } else {
            System.out.println("Entered value not correct");
        }
    }

}
