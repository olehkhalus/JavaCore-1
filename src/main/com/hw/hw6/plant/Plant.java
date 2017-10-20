package com.hw.hw6.plant;

public class Plant {
    
    private int size;
    private Color color;
    private Type type;

    public Plant() {
        this(0, Color.UNKNOWN, Type.UNKNOWN);
    }

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public String toString() {
        return String.format("SIZE %d COLOR '%s' TYPE '%s'", size, color.getDescription(), type.getDescription());
    }
}