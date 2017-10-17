package StringReg.HomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "I    am      learning     Java   Core";
        System.out.println(sentence.replaceAll("\\s+", " "));
    }

}
