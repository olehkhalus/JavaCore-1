package com.hw.hw4.regexp.io;

import java.util.regex.*;

public class InputController {
    private static final Person IN = new Person();
    private static final Pattern PATTERN = Pattern.compile("[A-Za-z0-9_]{3,15}");
    private static Matcher MATCH;

    public  static void setForename(String s) {
        if ((MATCH = PATTERN.matcher(s)).matches()) {
            IN.setFirstName(s);
        } else {
            throw new IllegalArgumentException("Valid name required (capital and lowercase letters, numbers and underscores are legal symbols)");
        }
    }

    public  static void setPatronymic(String s) {
        if ((MATCH = PATTERN.matcher(s)).matches()) {
            IN.setMiddleName(s);
        } else {
            throw new IllegalArgumentException("Valid name required (capital and lowercase letters, numbers and underscores are legal symbols)");
        }
    }

    public  static void setSurname(String s) {
        if ((MATCH = PATTERN.matcher(s)).matches()) {
            IN.setLastName(s);
        } else {
            throw new IllegalArgumentException("Valid name required (capital and lowercase letters, numbers and underscores are legal symbols)");
        }
    }
}