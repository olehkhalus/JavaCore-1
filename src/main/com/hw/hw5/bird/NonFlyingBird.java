package com.hw.hw5.bird;

public abstract class NonFlyingBird extends Bird { 

    protected String fly() {
        return ("cannot fly");
    }
}