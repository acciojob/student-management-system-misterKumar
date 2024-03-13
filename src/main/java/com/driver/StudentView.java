package com.driver;

import java.util.List;

public class StudentView {
    public void printStudentDetails(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
