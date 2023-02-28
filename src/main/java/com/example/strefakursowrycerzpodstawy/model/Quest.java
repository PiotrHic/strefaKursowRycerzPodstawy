package com.example.strefakursowrycerzpodstawy.model;

public class Quest {

    private String description;

    public Quest() {
    }

    public Quest(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "description='" + description + '\'' +
                '}';
    }
}
