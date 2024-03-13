package com.driver;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and setters...
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }
}

