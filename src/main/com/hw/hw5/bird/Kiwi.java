package com.hw.hw5.bird;

public class Kiwi extends NonFlyingBird {
    private static final String BIRD_TYPE = "Kiwi";
    
    protected String fly() {
        return String.format("%s %s", BIRD_TYPE, super.fly());
    }
}