package org.example.chapter5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Example4Test {

    @Test
    void test() {
        int[] answer = {1, 2, 3, 4, 5};
        Example4 exam = new Example4();

        int[] result = exam.solution(answer);
        System.out.println(Arrays.toString(result));

        int[] input2 = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(exam.solution(input2)));;

    }

}