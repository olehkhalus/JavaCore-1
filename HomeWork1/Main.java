package HomeWork1;
import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
import java.util.*;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
   	Scanner sc = new Scanner(System.in);

	System.out.println("Please, enter the radius:");
   	Double radius = sc.nextDouble();
   	Double perimeter = 3.14*2*radius;
   	Double area = 3.14*radius*radius;
	System.out.println("Perimeter= " +perimeter+", area= "+area );



   	String name;
	Integer age;
	System.out.println("What is your name?");
	name = sc.next();
	System.out.println("How old are you?");
	age = sc.nextInt();
    System.out.println("Your name is: "+name+", you are "+age+" years old");



    Calendar calendar = Calendar.getInstance();
    Integer year = calendar.get(Calendar.YEAR);
    if ((year-age)%4==0)
		System.out.println("You was born in leap year");
	else
		System.out.println("You was born in not leap year");



	for (int n =2; n>=0; n-- ) {
		String asterisk="";
		for (int i=0; i<n; i++) {
			asterisk= asterisk+ " ";
		}
		for (int i=0; i<=(2-n)*2; i++) {
			asterisk= asterisk+ "*";
		}
		System.out.println(asterisk);
		}

	}
	}


