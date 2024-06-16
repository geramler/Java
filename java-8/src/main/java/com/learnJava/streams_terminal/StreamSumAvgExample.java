package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamSumAvgExample {

    public static int sum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
    }

    public static double average() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println("Total No of notebooks : " + sum());

        System.out.println("Average No of notebooks: " + average());
    }
}
