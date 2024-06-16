package com.learnJava.parallelstream;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList) {
        long initialTime = System.currentTimeMillis();
        Integer reduce = integerList.stream()
                .reduce(0, (x,y) -> x+y);
        System.out.println("sequential time in ms is-> " + (System.currentTimeMillis() - initialTime));
        return reduce;
    }

    public static int parallelSum(List<Integer> integerList) {
        long initialTime = System.currentTimeMillis();
        Integer reduce = integerList.parallelStream()
                .reduce(0, (x, y) -> x + y);
        System.out.println("parallel time in ms is-> " + (System.currentTimeMillis() - initialTime));
        return reduce;
    }

    public static void main(String[] args) {
        List<Integer> boxed = IntStream.rangeClosed(1, 10000)
                .boxed()
                .toList();
        sequentialSum(boxed);
        parallelSum(boxed);
    }


}
