package com.hw.hw3.arraytricks;

public class  ArrayTricks {

    public static int getMax(int[] arr) {
       int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > res) {
                res = arr[i];
            }
        }
        return res;
    }

    public static int sumPos(int[] arr) {
        int res = 0;
        for (int i : arr) {
            if (i > 0) {
                res += i;
            }
        }
        return res;
    }        
    
    public static int countPos(int[] arr) {
        int res = 0;
        for (int i : arr) {
            if (i > 0) {
                res++;
            }
        }
        return res;
    }

    public static int countNeg(int[] arr) {
        int res = 0;
        for (int i : arr) {
            if (i < 0) {
                res++;
            }
        }
        return res;
    }     
}












