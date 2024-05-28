package com.learnJava.streams;

import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream().reduce(
                1, (a, b) -> a * b
        );
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream().reduce(
                (a, b) -> a * b
        );
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 5, 7);

        System.out.println("1. multiplication of numbers in the list is: " + performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        if (result.isPresent()) {
            System.out.println("2. multiplication of numbers in the list is: " + result.get());
        }
    }
}
