package com.driver;

import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Initialize the MVC components
        StudentController controller = new StudentController();
        StudentView view = new StudentView();
        Scanner scanner = new Scanner(System.in);

        // Interactive menu
        int choice;
        do {
            System.out.println("\nSelect an option:\n");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit\n");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(controller, scanner);
                    break;
                case 2:
                    viewStudents(controller, view);
                    break;
                case 3:
                    deleteStudent(controller, scanner);
                    break;
                case 4:
                    System.out.println("Exiting Student Client.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addStudent(StudentController controller, Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        controller.addStudent(name, id, age);
        System.out.println("Student added successfully.");
    }

    private static void viewStudents(StudentController controller, StudentView view) {
        List<Student> students = controller.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            view.printStudentDetails(students);
        }
    }

    private static void deleteStudent(StudentController controller, Scanner scanner) {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();
        boolean deleted = controller.deleteStudent(id);
        if (deleted) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Invalid Student ID. Student with ID " + id + " does not exist.");
        }
    }
        /*
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
         */
}

