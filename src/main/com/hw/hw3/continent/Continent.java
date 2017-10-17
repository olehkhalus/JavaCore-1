package com.hw.hw3.continent;

public enum Continent { 
    UNKNOWN("UNKNOWN"),
    AFRICA("Africa"), 
    ASIA("Asia"), 
    EUROPE("Europe"), 
    NORTH_AMERICA("North America"), 
    SOUTH_AMERICA("South America"), 
    ANTARCTICA("Antarctica"), 
    AUSTRALIA_OCEANIA("Australia and Oceania");
   
    Continent(String description) {
        this.description = description; 
    }

    private String description;
    
    public String getDescription() { 
        return description; 
    }
}