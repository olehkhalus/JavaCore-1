import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        a = sc.nextInt();
        System.out.print("Input b: ");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("a + b = " + sum);
        int sub = a - b;
        System.out.println("a - b = " + sub);
        int mult = a * b;
        System.out.println("a * b = " + mult);
        int div = a / b;
        System.out.println("a / b = " + div);


    }
}
