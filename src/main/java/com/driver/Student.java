package com.driver;

public class Student {
    private String name;
    private int id;
    //private int age;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
//        this.age=age;
    }

    // Getters and setters...
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

//    public int getAge() {
//        return age;
//    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name +  "]";
    }
}

