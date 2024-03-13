package com.driver;

import java.util.List;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Initialize the MVC components
        StudentController controller = new StudentController();
        StudentView view = new StudentView();

        // Add students
        controller.addStudent("Alice", 1);
        controller.addStudent("Bob", 2);

        // View all students
        List<Student> allStudents = controller.getAllStudents();
        view.printStudentDetails(allStudents);

        // Delete a student
        controller.deleteStudent(1);

        // View students after deletion
        allStudents = controller.getAllStudents();
        view.printStudentDetails(allStudents);
    }
}

