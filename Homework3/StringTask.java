import java.util.*;
public class StringTask {
    public static void main(String... args){
        String maxLengthWord="";
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[];
        arr=str.split("\\s");
        for(int i=0;i<arr.length;i++){
            if(maxLengthWord.length()<arr[i].length()) maxLengthWord=arr[i];
            System.out.println(arr[i]+" has "+arr[i].length()+" letters");
        }
        System.out.println("the longest word is: "+maxLengthWord);
        System.out.println(new StringBuilder(arr[1]).reverse().toString());

    }
}
