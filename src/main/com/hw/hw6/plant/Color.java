package com.hw.hw6.plant;

import java.util.Map;
import java.util.HashMap;
import java.util.NoSuchElementException;

/*
 * https://codereview.stackexchange.com/questions/46175/java-enum-containing-a-hash-map-for-look-up
 *
 */

public enum Color {
    UNKNOWN(0, "UNKNOWN"),
    RED(1, "Red"),
    ORANGE(2, "Orange"),
    YELLOW(3, "Yellow"),
    GREEN(4, "Green"),
    CYAN(5, "Cyan"),
    BLUE(6, "Blue"),
    INDIGO(7, "Indigo"),
    VIOLET(8, "Violet");

    private final Integer code;
    private final String description;
    private static Map<Integer, String> ColorMap;

    private Color(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static String getDescriptionByCode(Integer code) {
        if (ColorMap == null) {
            initializeMapping();
        }
        if (ColorMap.containsKey(code)) {
            return ColorMap.get(code);
        }
        throw new NoSuchElementException("Enum constant not present");
    }

    private static void initializeMapping() {
        ColorMap = new HashMap<Integer, String>();
        for (Color c : Color.values()) {
            ColorMap.put(c.code, c.description);
        }
    }
}
