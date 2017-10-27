package com.hw.hw8.practicaltasks;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;

public class IOLab {
    private static final Path FILE_PATH = Paths.get("Lorem_ipsum.txt");
    private static final Charset ENCODING = Charset.forName("UTF-8");
    private static final List<String> CONTENT = init();
    private static final Comparator<String> BY_LENGTH = (s1, s2) -> Integer.compare(s1.length(), s2.length());

    /**
     *  "Note that this method is intended for simple cases where it is convenient 
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

    public String shortest() {
        return Collections.min(CONTENT, BY_LENGTH);
    }

    public String longest() {
        return Collections.max(CONTENT, BY_LENGTH);
    }

    public List<String> byRegex(String reg) {
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

    public void stdout() {
        for (int i = 0, j = 1; i < CONTENT.size(); i++, j++) {
            System.out.printf("LINE №%d [%d chars long]: \"%s\"%n", j, CONTENT.get(i).length(), CONTENT.get(i));
        }
    }
}