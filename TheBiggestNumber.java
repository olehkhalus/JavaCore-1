package JavaCore;

import java.util.ArrayList;
import java.util.Collections;

public class TheBiggestNumber {
    public static void main(String[] args) {
        int [] array = {10,25,-3,45,-7,29,-35,11,-1};
        ArrayList negativeNumbers = new ArrayList();

        for (int number: array){
            if (number < 0){
                negativeNumbers.add(number);
            }
        }
        System.out.println(Collections.max(negativeNumbers));
    }
}
