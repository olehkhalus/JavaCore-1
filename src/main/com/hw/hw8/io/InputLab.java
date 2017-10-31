package com.hw.hw8.io;

import java.util.*;
import java.util.regex.*;
import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.Charset;

public class InputLab {
    public static final Path FILE_PATH = Paths.get("input.txt");
    public static final Charset ENCODING = Charset.forName("UTF-8");
    public static final List<String> CONTENT = init();
    public static final Comparator<String> BY_LENGTH = (s1, s2) -> Integer.compare(s1.length(), s2.length());

    /**
     *  "Note that this method is intended for simple cases where CONTENTit is convenient 
     *  to read all lines in a single operation. It is not intended for reading in large files."
     *  See <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/file/Files.html#readAllLines(java.nio.file.Path,%20java.nio.charset.Charset)">readAllLines</a>
     *  
     */
    private static List<String> init() {
        List<String> res = new ArrayList<>();
        try {
            res = Files.readAllLines(FILE_PATH, ENCODING);
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        return res;
    }

    public static String shortest() {
        return Collections.min(CONTENT, BY_LENGTH);
    }

    public static String longest() {
        return Collections.max(CONTENT, BY_LENGTH);
    }

    public static List<String> byRegex(String reg) {
        List<String> res = new ArrayList<>();
        Pattern pat = Pattern.compile(reg);
        for (String line : CONTENT) {
            Matcher match = pat.matcher(line);
            while (match.find()) {
                res.add(line);
            }
        }
        return res;
    }
}