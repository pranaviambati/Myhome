package com.myhome.model;

public class Interior {
    private String name;
    private String description;

    public Interior(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
