package com.hw.hw6.plant;

import java.util.Map;
import java.util.HashMap;
import java.util.NoSuchElementException;

public enum Type {
    UNKNOWN(1, "UNKNOWN"), 
    ZENOBIA(2, "Zenobia"), 
    JACARANDA(3, "Jacaranda"), 
    IRIS(4, "Iris"), 
    VERBENA(5, "Verbena"), 
    VANILLA(6, "Vanilla"), 
    HELCONIA(7, "Heliconia");

    private final Integer code;
    private final String description;
    private static Map<Integer, String> TypeMap;

    private Type(Integer code, String description) {
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
        if (TypeMap == null) {
            initializeMapping();
        }
        if (TypeMap.containsKey(code)) {
            return TypeMap.get(code);
        }
        throw new NoSuchElementException("Enum constant not present");
    }

    private static void initializeMapping() {
        TypeMap = new HashMap<Integer, String>();
        for (Type t : Type.values()) {
            TypeMap.put(t.code, t.description);
        }
    }
}