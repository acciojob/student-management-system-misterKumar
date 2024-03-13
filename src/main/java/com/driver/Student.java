package com.driver;

public class Student {
    private String name;
    private String id;
    private int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age=age;
    }

    // Getters and setters...
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

