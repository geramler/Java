package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsFlatMapExample {

    public static Set<String> printStudentActivities() {

        Set<String> studentActivities =
                StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toSet());

        return studentActivities;
    }

    public static List<String> printDistinctSortedStudentActivities() {

        List<String> studentActivities =
                StudentDataBase.getAllStudents().stream()
                        .map(Student::getActivities)
                        .flatMap(List::stream)
                        .distinct()
                        .sorted()
                        .collect(toList());

        return studentActivities;
    }

    public static long getStudentActivitiesCount() {

        long noOfStudentActivities =
                StudentDataBase.getAllStudents().stream()
                        .map(Student::getActivities)
                        .flatMap(List::stream)
                        .distinct()
                        .count();

        return noOfStudentActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities: " + printStudentActivities());
        System.out.println("printDistinctSortedStudentActivities: " + printDistinctSortedStudentActivities());
        System.out.println("getStudentActivitiesCount: " + getStudentActivitiesCount());
    }
}
