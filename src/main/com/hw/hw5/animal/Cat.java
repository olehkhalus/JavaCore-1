package com.hw.hw5.animal;

public class Cat implements Animal {
    
    public String voice() {
        return meow();
    }

    public String meow() {
        return "Miaow";
    }
    
    public String feed() {
        return "Yummy!";
    }
}