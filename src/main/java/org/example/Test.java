package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String args[]) {
        List<Integer> ss = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        ss.stream().collect(Collectors.toMap(e->e,e->e));
        System.out.print
        List<Integer> result = new ArrayList<Integer>();

        Stream<Integer> stream = ss.parallelStream();

        stream.map(s -> {


                    result.add(s);


            return s;
        }).forEach(e -> {
        });
        System.out.println(result);
    }
}
