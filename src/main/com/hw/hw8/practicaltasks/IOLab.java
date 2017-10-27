package com.hw.hw8.practicaltasks;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOLab {
    private static final String FILE_PATH = "src/main/com/hw/hw8/practicaltasks/Lorem ipsum.txt";
    private static final List<String> CONTENT = initialise();
    private static final Comparator<String> BY_LENGTH = (s1, s2) -> Integer.compare(s1.length(), s2.length());

    private static List<String> initialise() {
        String res = "";
        try {
            res = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        return Arrays.asList(res.split("\\r?\\n"));
    }

    public String shortest() {
        return Collections.min(CONTENT, BY_LENGTH);
    }

    public String longest() {
        return Collections.max(CONTENT, BY_LENGTH);
    }

    public String getPattern(String reg) {
        String res = "";
        Pattern pat = Pattern.compile(reg);
        for (String line : CONTENT) {
            Matcher match = pat.matcher(line);
            while (match.find()) {
                res = line;
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