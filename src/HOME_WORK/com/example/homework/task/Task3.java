package HOME_WORK.com.example.homework.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String NAME ;
        int AGE = 1;

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("What is your name?");
            NAME = br.readLine();
        System.out.println("How old are you?");
        AGE = br.read();
        System.out.println("Your name " + NAME + "\nYour age " + AGE);

    }
}
