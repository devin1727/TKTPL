package com.example.helloworld;

public class Item {
    private String day;
    private String task;
    private String details;

    public Item(String day, String task, String details) {
        this.day = day;
        this.task = task;
        this.details = details;
    }

    public String getDay() {
        return this.day;
    }

    public String getTask() {
        return this.task;
    }

    public String getDetails() {
        return this.details;
    }
}
