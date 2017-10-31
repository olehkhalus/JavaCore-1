package com.hw.hw8.io;

import static com.hw.hw8.io.InputLab.*;
import java.io.*;

public class OutputLab {
    public static final File FILE_PATH = new File("output.txt");

    public static void write() {
        try {
            new PrintStream(FILE_PATH).printf("%d%n%s%n%s%n", InputLab.CONTENT.size(), InputLab.longest(), InputLab.shortest());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new OutputLab().write();
    }
}