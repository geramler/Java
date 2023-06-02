package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentGradeLevelPredicate = s -> s.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = s -> s.getGpa() >= 3.9;

        Map<String, List<String>> result = StudentDataBase.getAllStudents().stream()
                .filter(studentGradeLevelPredicate)
                .peek(s -> System.out.println(
                        "After 1st filter:\n" + s))
                .filter(studentGpaPredicate)
                .peek(s -> System.out.println(
                        "After 2nd filter:\n" + s))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println("\nresult is: \n" + result);
    }
}
