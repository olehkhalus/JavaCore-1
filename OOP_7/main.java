import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class main {
    public static void main(String...args) throws IOException {
      /*String first = "IT";
        String second = "IT Academy";
        System.out.println(RegularExpression.isIn(first,second));   */

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String name = sc.readLine();
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter the middleName:");
        String middleName = sc.next();
        System.out.println("Enter the lastName:");
        String lastName = sc.next();
        System.out.println(RegularExpression.initials(name, middleName, lastName ));
        System.out.println(RegularExpression.initials2(name, middleName, lastName));
        System.out.println(name);
        System.out.println(name+" "+middleName+" "+lastName);  */

      /*System.out.println(RegularExpression.userName("df"));
        System.out.println(RegularExpression.userName("df_0550dsdsA"));
        System.out.println(RegularExpression.userName("df=dsd"));
        System.out.println(RegularExpression.userName("dfAfdsfd"));
        System.out.println(RegularExpression.userName("df050505"));  */

        System.out.println(HomeWork7.longestWord("П'ять будь-яких слів різної довжини"));
        System.out.println(HomeWork7.index("П'ять будь-яких слів різної довжини"));
        System.out.println(HomeWork7.revers("П'ять будь-яких слів різної довжини"));
        System.out.println(HomeWork7.oneSpace("П'ять      будь-яких               слів      55"));

        System.out.println(HomeWork7.currencyUS("sfdf $20.00 adfasdfsdf $500 adsads $22.44   $33.3333333"));

    }
}
