package StringReg.HomeWork;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence ");
        String sentence = scanner.nextLine();

        String words[] = sentence.split("[^a-zA-Z]");
        int i, size = words.length;
        int iMax = -1, iMaxLength = -1;
        for (i = 0; i < size; ++i)
            if (!"".equals(words[i]) && words[i].length() > iMaxLength) {
                iMax = i;
                iMaxLength = words[i].length();
            }
        if (iMax == -1)
            System.err.println("String has no contains words");
        else
            System.out.println("Index = " + iMax + "\tword = " + words[iMax]+" \tWord length  = "+words[iMax].length());

        System.out.println(new StringBuilder(words[1]).reverse().toString());

    }

 }

