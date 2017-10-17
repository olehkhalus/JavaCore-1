package com.hw.hw4;

import java.util.Arrays;

public class StringTricks {
    
    private static String[] splitter(String str) {
        String[] result = str.split("\\s");
            return result;
    }

    public static String remSpaces(String str) {
        return str.trim().replaceAll(" +", " ");
    }

    public static String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }    

    public static int countChar(String str) {
        return str.length();
    }

    public static String getMaxLenWord(String str) {
        String[] arr = splitter(str); 
        String res = "";
        for (String s : arr) {
            if (s.length() > res.length()) {
                res = s;
            }
        }
        return res;
    }
}    
