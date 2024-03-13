package com.driver;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, String id, int age) {
        Student student = new Student(name, id, age);
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public boolean deleteStudent(String id) {
        boolean removed = students.removeIf(student -> student.getId().equals(id));
        return removed;
    }
}

