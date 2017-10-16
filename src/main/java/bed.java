package HomeWork;

import java.util.*;

import static java.lang.Math.PI;

public class bed {
    private String name;
    private double radius;
    bed(String name, double radius){
        this.name = name;
        this.radius = radius;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double circle_perimeter, circle_area;

        System.out.println("Enter the name of  Bed and it's radius");

        bed flowerBed = new bed(scanner.nextLine(), scanner.nextDouble());

        circle_area = PI*flowerBed.radius*flowerBed.radius;

        circle_perimeter = 2*PI*flowerBed.radius;

        System.out.println("area is "+circle_area);

        System.out.printf("perimeter is "+"%.2f",circle_perimeter);

        System.out.println();

        System.out.println("enter length of a wire:");

        double wire_length = scanner.nextDouble();

        if(wire_length >= circle_perimeter) System.out.println("Is able to fence");

        else System.out.println("not able to fence");
    }
}


