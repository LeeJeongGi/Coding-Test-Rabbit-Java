package org.example.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {

    @Test
    void test() {
        Example1 example1 = new Example1();
        int[] arr = {1, -5, 2, 4, 3};
        int[] result = example1.solution(arr);

        System.out.println(result.toString());
        assertArrayEquals(result, arr);
    }

}