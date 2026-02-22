package com.student;

import java.util.Scanner;

class Student {

    final String COURSE_NAME = "Artificial Intelligence and Data Science";
    static int totalStudents = 0;

    String name;
    int id;
    double marks;
    char grade;

    Student() {
        name = "Unknown";
        id = 0;
        marks = 0.0;
        grade = 'F';
        totalStudents++;
    }

    Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.grade = calculateGrade(marks);
        totalStudents++;
    }

    char calculateGrade(double marks) {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 40)
            return 'D';
        else
            return 'F';
    }

    void display() {
        System.out.println("\nCourse Name: " + COURSE_NAME);
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, id, marks);
        }

        System.out.println("\n----- Student Performance Details -----");

        for (Student s : students) {
            s.display();
        }

        System.out.println("\nTotal Students Created: " + Student.totalStudents);

        sc.close();
    }
}
