package com.hw.hw4.io;

import java.util.regex.*;

public class RegExp {

    public static boolean isSubstring(String s, String s_) {
        boolean res = false;
        String[] ar = s.toLowerCase().trim().replaceAll(" +", " ").split("\\s");
        String[] ar_ = s_.toLowerCase().trim().replaceAll(" +", " ").split("\\s");;
             for (String i : ar) {
                for (String j : ar_) {
                    if (i.equals(j)) {
                        res = true;
                    }
                }
             }       
        return res;
    }

    public static boolean findPatMatch(String pattern, String text) {
        Pattern ptrn = Pattern.compile(pattern);
        Matcher mtch = ptrn.matcher(text);
        if (mtch.matches()) {
            mtch.reset();
            return true;
        } else {
            return false;
        }
    }
}