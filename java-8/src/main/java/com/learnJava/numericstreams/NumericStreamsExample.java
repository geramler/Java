package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNNumbers(List<Integer> integerList){
        return integerList.stream()
                // needs unboxing in each iteration
                .reduce(0, (x, y) -> x + y);
    }

    public static int sumOfNNumbersIntStream() {
        return IntStream.rangeClosed(1,5)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        System.out.println("sumOfNNumbers->" + sumOfNNumbers(integerList));
        System.out.println("sumOfNNumbersIntStream->" + sumOfNNumbersIntStream());
    }
}
