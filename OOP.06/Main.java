import sun.misc.Cache;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

public class Main {
    public static void main(String...args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(HomeWork6.div(-1, 0));
        }catch (Exception text) {
        System.out.println(text.getMessage());
        }


        System.out.println("Enter two numbers, more then 0:");
        int z = 1;
        int x = 1;
        try {
            switch (z = Integer.parseInt(bf.readLine())){}
            switch (x = Integer.parseInt(bf.readLine())){}
        }
        catch (NumberFormatException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            System.out.println(Exceptions.squareRectangle(z,x));
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }


     /*   Plants sanFlower = new Plants(55, "Yellow", "Flower");
        System.out.println(sanFlower);
        Plants roze = new Plants(30,"Red","Flower");
        System.out.println(roze);
        Plants grass = new Plants(10,"Green","Grass");
        System.out.println(grass);
        try {
            Plants rozeBlack = new Plants(30, "Black", "Flower");
            System.out.println(rozeBlack);
        }catch (Plants.ColorException | Plants.TypeException ex) {
            System.err.println(ex.getMessage() + "\n");
        }*/

 /*    try{
            result = HomeWork6.readNumber(22,99,90);
        }catch(Exception e){
            System.err.println(e.getMessage());
                }
        System.out.println("Введене число : "+result); */

   /*    System.out.println("Enter 10 numbers pleas:");
        int result = 0;
        int[] array = new int[11];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(bf.readLine());
            } catch (NumberFormatException x){
            System.err.println(x.getMessage());
        }
        }
               for (int i = 1; i < array.length; i++) {
                    int a= array[i-1];
                    int b =array[i];
                try {
                    result = HomeWork6.readNumber(a, 90 + i, b);

                } catch (Exception e) {
                    System.err.println("Вееденне число не відповідає обмеженням");
                }
                System.out.println("Введене число : "+result);
            } */

        }
    }


