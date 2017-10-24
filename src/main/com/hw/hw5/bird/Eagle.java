package com.hw.hw5.bird;

public class Eagle extends FlyingBird {
    private static final String BIRD_TYPE = "Eagle";
    
    protected String fly() {
        return String.format("%s %s", BIRD_TYPE, super.fly());
    }
}