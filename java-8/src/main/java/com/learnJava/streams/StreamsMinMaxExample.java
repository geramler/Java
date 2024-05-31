package com.learnJava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x,y) -> x > y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        if(maxValueOptional.isPresent()){
            System.out.println("Max value in list is: " + maxValueOptional.get());
        } else {
            System.out.println("Could not find max value in list");
        }
    }

}
