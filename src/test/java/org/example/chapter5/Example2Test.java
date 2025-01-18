package org.example.chapter5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {

    @Test
    void test() {
        int[] input = {4, 2, 2, 2, 1, 3, 4};
        Example2 example2 = new Example2();

        int[] result = example2.solution(input);
        System.out.println(Arrays.toString(result));
        assertEquals(4, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(1, result[3]);

    }

}