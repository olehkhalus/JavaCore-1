package com.hw.hw5.bird;

public class Swallow extends FlyingBird {
    private static final String BIRD_TYPE = "Swallow";
    
    protected String fly() {
        return String.format("%s %s", BIRD_TYPE, super.fly());
    }
}