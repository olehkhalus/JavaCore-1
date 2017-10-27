package com.hw.hw4;

import java.util.Arrays;

public class StringTricks {
    
    private static String[] splitter(String str) {
        return str.split("\\s");
    }

    public static String remSpaces(String str) {
        return str.trim().replaceAll(" +", " ");
    }

    public static String getReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }    

    public static int countChar(String str) {
        return str.length();
    }

    public static String getMaxLenWord(String str) {
        String res = "";
        for (String s : splitter(str)) {
            if (s.length() > res.length()) {
                res = s;
            }
        }
        return res;
    }
}    
