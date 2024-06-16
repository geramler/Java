package com.learnJava.parallelstream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {
        long initialTime = System.currentTimeMillis();
        List<String> activityList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        long endTime = System.currentTimeMillis();
        System.out.println("sequential time in ms is: " + (endTime-initialTime));
        return activityList;
    }

    public static List<String> parallelPrintStudentActivities() {
        long initialTime = System.currentTimeMillis();
        List<String> activityList = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        long endTime = System.currentTimeMillis();
        System.out.println("parallel time in ms is: " + (endTime-initialTime));
        return activityList;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
