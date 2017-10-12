import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();

    boolean result=LeapYear.isLeap(year);
    System.out.print(result);
}
    public static boolean isLeap(int year){
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) return false;
        else return true;
    }
}
