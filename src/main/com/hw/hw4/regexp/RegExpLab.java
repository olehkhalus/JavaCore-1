package com.hw.hw4.io;

import java.util.regex.*;

public class RegExpLab {

    public static boolean isSubstring(String s, String s_) {
        boolean res = false;
        String[] ar = s.toLowerCase().trim().replaceAll(" +", " ").split("\\s");
        String[] ar_ = s_.toLowerCase().trim().replaceAll(" +", " ").split("\\s");;
             for (String i : ar) {
                for (String k : ar_) {
                    if (i.equals(k)) {
                        res = true;
                    }
                }
             }       
        return res;
    }

    public static boolean findMatch(String pat, String txt) {
        Pattern pattern = Pattern.compile(pat);
        Matcher match = pattern.matcher(txt);
        if (match.matches()) {
            return true;
        } else {
            return false;
        }
    }
}