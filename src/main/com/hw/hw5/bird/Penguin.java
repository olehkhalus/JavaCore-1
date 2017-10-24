package com.hw.hw5.bird;

public class Penguin extends NonFlyingBird {
    private static final String BIRD_TYPE = "Penguin";

    protected String fly() {
        return String.format("%s %s", BIRD_TYPE, super.fly());
    }
}