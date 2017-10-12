import java.util.*;
public class FlowerBed{
    String name;
    double radius;
    FlowerBed(String name, double radius){
        this.name=name;
        this.radius=radius;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double PI=3.14;
        double circle_perimeter, circle_area;
        System.out.println("Enter the name of Flower Bed and it's radius");
        FlowerBed flowerBed=new FlowerBed(scanner.nextLine(), scanner.nextDouble());
        circle_area=PI*flowerBed.radius*flowerBed.radius;
        circle_perimeter=2*PI*flowerBed.radius;
        System.out.println("Area is "+circle_area);
        System.out.printf("Perimeter is "+"%.2f",circle_perimeter);
        System.out.println();
        System.out.println("Enter length of a wire:");
        double wire_length=scanner.nextDouble();
        if(wire_length>=circle_perimeter) System.out.println("Is able to fence");
        else System.out.println("Not able to fence");
    }
}

