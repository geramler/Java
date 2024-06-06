package com.learnJava.numericstreams;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        System.out.println("range count->" + IntStream.range(1,50).count());
        IntStream.range(1,50).forEach(value -> System.out.print(value + ", "));
        System.out.println();
        System.out.println("range closed count->" + IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ", "));
        System.out.println();
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value + ", "));
    }
}
