package StringReg.HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String dollar = "I have $1000 dollars";
        String pattern = "\\$(\\d*)(\\.\\d{2})?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(dollar);
        while (m.find()) {
            System.out.print(dollar
                    .substring(m.start(), m.end()));
        }

    }
}
