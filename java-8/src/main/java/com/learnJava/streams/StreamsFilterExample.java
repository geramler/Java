package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGender().equals("female"))
                .filter(s -> s.getGpa() >= 3.9)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println("filtered students are: ");
        filterStudents().stream().forEach(System.out::println);
    }

}
