import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 19.10.2017.
 */
public class HomeWork7 {
    /* Enter in the console sentence of five words.
       display the longest word in the sentence
       determine the number of its letters
       bring the second word in reverse order */

    public static String longestWord(String text){
        String[]arr =text.trim().split("\\s+");
        String maxLong=arr[0];
        for (int i=1; i <arr.length; i++){
            if (maxLong.length() < arr[i].length())
                maxLong = arr[i];
        }
        return maxLong;
    }
    public static int index(String text) {
        String word = HomeWork7.longestWord(text);
        return text.indexOf(word);
    }

    public static String revers(String text){
        String[]arr =text.trim().split("\\s+");
        String maxLong=arr[0];
        int num=0;
        String midleLong="";
        for (int i=1; i <arr.length; i++){
            if (maxLong.length() < arr[i].length()) {
                maxLong = arr[i];
                num = i;
            }
        }
        for (int j=0; j<arr.length; j++) {
            if (j !=num && midleLong.length() <arr[j].length())
                midleLong = arr[j];
                }
        StringBuilder sb = new StringBuilder(midleLong);
        return sb.reverse().toString();
    }
    /* Enter a sentence that contains the words between more than one space.
    Convert all spaces, consecutive, one.
    For example, if we introduce the sentence
    "I    am      learning     Java   Core»,
    we have to get the "I'm learning Java Core»
     */
    public static String oneSpace (String text) {
        String newText =text;
        for (int i=0; i < text.length(); i++) {
            newText = newText.replaceAll("\t", " ");
            newText = newText.replaceAll("  ", " ");
        }
        return newText;
    }
    /* Implement a pattern for US currency: the first symbol "$", then any number of digits,
    dot and two digits after the dot.
    Enter the text from the console that contains several occurrences of US currency.
    Display all occurrences on the screen.
     */

    public static String currencyUS (String text) {
        String tmp = "";
        String pattern = "[\\$]+[\\d]+[\\.]?[\\d]{2}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            tmp += (text.substring(m.start(), m.end())+" ");
        }
        return tmp;
    }
}
