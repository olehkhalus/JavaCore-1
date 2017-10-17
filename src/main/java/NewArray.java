package main.java;

import java.util.Random;

public class NewArray {
    public static void main(String[] args) {

    int[] array = new int[10];{
    for (int i = 0; i < array.length; i++) {
        array[i] = ((int)(Math.random() * 55) -15);
        System.out.println(array[i]);
            }
            int max = array[0];
            for(int i = 0; i < array.length; i++) {
                if(array[i] > max)
                    max = array [i];
            }
            System.out.println("Максимальное число: " + max);
        }
    }
}
