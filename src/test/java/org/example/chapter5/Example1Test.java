package org.example.chapter5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {

    @Test
    void test() {
        Example1 example1 = new Example1();
        int[] arr = {1, -5, 2, 4, 3};
        int[] result = example1.solution(arr);

        Arrays.stream(result).forEach(System.out::print);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(result, arr);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1,-5,2,4,3", "2,1,1,3,2,5,4", "6,1,7"})
    void test2(String input) {
        int[] arr = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();

        Arrays.stream(arr).forEach(System.out::print);
        Example1 example1 = new Example1();
        int[] result = example1.solution(arr);

        Arrays.stream(result).forEach(System.out::print);
        assertArrayEquals(result, arr);
        System.out.println();
    }
}