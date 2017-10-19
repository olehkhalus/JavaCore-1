import java.util.*;
import java.util.regex.*;
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
