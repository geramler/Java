package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAny() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 4.1)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> any = findAny();
        if(any.isPresent()) {
            System.out.println("Found student is: " + any.get());
        } else {
            System.out.println("Student not found!");
        }

        Optional<Student> first = findFirst();
        if(first.isPresent()) {
            System.out.println("Found student is: " + first.get());
        } else {
            System.out.println("Student not found!");
        }
    }
}
