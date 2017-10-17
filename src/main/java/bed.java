package main.java;

import java.util.*;

import static java.lang.Math.PI;
import java.io.PrintStream;
import static java.lang.System.out;

public class bed {
    private String name;
    private double radius;
    bed(String name, double radius){
        this.name = name;
        this.radius = radius;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double circlePerimeter, circleArea;

        out.print("Enter the name of  Bed and it's radius");

        bed flowerBed = new bed(scanner.nextLine(), scanner.nextDouble());

        circleArea = PI*flowerBed.radius*flowerBed.radius;

        circlePerimeter = 2*PI*flowerBed.radius;

       out.print("area is "+circleArea);
       out.printf("perimeter is "+"%.2f",circlePerimeter);
        out.println();
        out.print("enter length of a wire:");

        double wire_length = scanner.nextDouble();

        if(wire_length >= circlePerimeter) System.out.println("Is able to fence");

        else System.out.println("not able to fence");
    }
}


