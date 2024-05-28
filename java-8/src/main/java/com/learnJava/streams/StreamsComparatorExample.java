package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    public static List<Student> sortStudentsByGPA() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .toList();
    }

    public static List<Student> sortStudentsByGPADesc() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .toList();
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by Name : ");
        sortStudentsByName().stream().forEach(System.out::println);
        System.out.println("Students sorted by GPA : ");
        sortStudentsByGPA().stream().forEach(System.out::println);
        System.out.println("Student sorted by GPA Desc");
        sortStudentsByGPADesc().stream().forEach(System.out::println);;
    }
}
