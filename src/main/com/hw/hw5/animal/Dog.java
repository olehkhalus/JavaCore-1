package com.hw.hw5.animal;

public class Dog implements Animal {
    
    public String voice() {
        return bark();
    }

    private String bark() {
        return "Woof woof woof";
    }
    
    public String feed() {
        return "Om nom nom";
    }
}