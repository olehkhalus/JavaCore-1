package com.hw.hw3.employee;

public enum Department { 
    UNKNOWN("UNKNOWN"),
    DOS("United States Department of State"), 
    TREASURY("United States Department of the Treasury"), 
    DOJ("United States Department of Justice"), 
    DOI("United States Department of the Interior"), 
    USDA("United States Department of Agriculture"), 
    HO("Home Office"), 
    DOL("United States Department of Labor"), 
    DOD("United States Department of Defense"), 
    ED("United States Department of Education");

    Department(String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }
}
