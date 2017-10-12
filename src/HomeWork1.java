//package IdeaProjects.src.circle;
import javafx.scene.shape.Circle;

import java.lang.Math;
import java.util.Scanner;




public class HomeWork1 {

    /**Flower bed is shaped like a circle.
     * Calculate the perimeter and area by entering the radius.
     * Output obtained results.
     */
/
    public void Circle (){
        double radius;
        double p;
        double area;
        System.out.print("Enter the radius");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        p = 2*Math.PI*radius;
        area = Math.PI * (radius*radius);
        System.out.println("Perimetr = "+ p);
        System.out.println("Area = " + area);



    /**Define string variable name and integer value age.
     * Output question "What is your name?" read the value name and
     * output next question: "How old are you?" read the value age and write whole information.
     */


    public void Name(){
        String name;
        int age;
        System.out.println("What is your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("How old are you? ");
        age = sc.nextInt();
        System.out.println("My name is "+ name + ". I am " + age);

    }

    /**Take previous example about leap year
     * and rewrite it using one condition
     * If together with Logical operators
     */

    public void Year(){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year please ");
        year = sc.nextInt();
        if ( (year % 4 == 0 & year % 100 != 0)|| year % 400 == 0) {
                System.out.print("Your year is leap");
        }

        // I need a help with this method !
    public void Asterics (){
        System.out.print("Enter number of colums ");
        Scanner sc = new Scanner(System.in);
        int colum = sc.nextInt();
        for (int i=1; i <=colum-1; i++ ) {
            System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
        }
    }

    public static void main (String [] args){

        HomeWork1 cir = new HomeWork1();
        cir.Circle();
        HomeWork1 name = new HomeWork1();
        name.Name();
        HomeWork1 year = new HomeWork1();
        year.Year();
        HomeWork1 asterics = new HomeWork1();
        asterics.Asterics();


    }


}
