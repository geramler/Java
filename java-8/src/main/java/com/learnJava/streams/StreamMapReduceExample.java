package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks() {
        int noOfNoteBooks =
                StudentDataBase.getAllStudents().stream()
                        .filter(student -> student.getGradeLevel()>=3)
                        .filter(student -> student.getGender().equals("female"))
                        .map(Student::getNotebooks)
                        .reduce(0, (a,b) -> a + b);
        return noOfNoteBooks;
    }

    public static void main(String[] args) {
        System.out.println("noOfNotebooks : " + noOfNoteBooks());
    }
}
