package org.example.chapter5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Example3Test {

    @Test
    void test() {
        int[] input1 = {2, 1, 3, 4, 1};
        Example3 exam = new Example3();

        int[] result = exam.solution(input1);
        System.out.println(Arrays.toString(result));

        int[] input2 = {5, 0, 2, 7};
        result = exam.solution(input2);
        System.out.println(Arrays.toString(result));
    }

}