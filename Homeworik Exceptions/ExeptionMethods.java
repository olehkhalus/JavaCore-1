import java.util.Scanner;

public class ExeptionMethods extends Exception{
    public static int squareRectangle(int a, int b){
        if(a > 0 && b > 0) {return a*b;}
        else {
            throw new IllegalArgumentException();
        }
    }
    public static double div(double a, double b) {
        if(b!=0) {return a/b;}
        else{
            throw new IllegalArgumentException("Divisoin by 0");
        }
    }
    public static int readNumber(int min, int max){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=min && num<=max) {return num;}
        else{
            throw new IllegalArgumentException("Invalid number entered");

        }
    }
}
