import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 19.10.2017.
 */
public class RegularExpression {

        /* Enter the two variables of type String. Determine whether the first variable substring second.
           For example, if you typed «IT» and «IT Academy» you must receive true. */

    public static Boolean isIn(String first, String second){
        Pattern p = Pattern.compile(first);
        Matcher m = p.matcher(second);
        return m.find();
        }

        /* Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
           surnames and initials
           name
           name, middle name and last name */

    public static String initials(String name, String middleName, String lastName) {
        String mix = name + middleName;
        StringBuilder sb = new StringBuilder(lastName);
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(mix);
        while (m.find()) {
            sb.append(" " + mix.substring(m.start(), m.end()) + ".");
        }
        return sb.toString();
    }

    public static String initials2 (String name, String middleName, String lastName) {
        StringBuilder sb = new StringBuilder(lastName);
        char middle = middleName.charAt(0);
        char charName = name.charAt(0);
        sb.append(" "+charName+"."+" ");
        sb.append(middle+".");
        return sb.toString();
    }

    /* The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
        Using regular expressions implement checking the user name for validity.
        Input five names in the main method .
        Output a message to the console of the validation of each of the entered names.
     */
    public static Boolean userName (String name) {
        String pattern ="[a-zA-Z0-9_]{3,15}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        return (m.matches());
    }

}
