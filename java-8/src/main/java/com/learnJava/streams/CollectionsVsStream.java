package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("adam", "jim", "jenny");

        System.out.println(names.get(0));

        Stream<String> stream = names.stream();

        stream.forEach(System.out::println);

        // steam has already being consumed
        // stream.forEach(System.out::println);
    }
}
