import java.util.*;
import java.util.regex.*;
/*Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two digits after the dot. Enter the text from the console that contains several occurrences of US currency. Display all occurrences on the screen.*/

public class Currency {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Pattern p=Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher m=p.matcher(str);
        if(m.matches()) m.reset();
        while(m.find()){
            System.out.println(str.substring(m.start(),m.end())+" ");
        }

    }
}
