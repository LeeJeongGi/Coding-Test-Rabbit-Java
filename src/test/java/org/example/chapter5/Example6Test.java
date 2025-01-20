package org.example.chapter5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Example6Test {

    @Test
    void test() {
        Example6 exam = new Example6();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = exam.solution(N, stages);
        System.out.println(Arrays.toString(result));

        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(exam.solution(4, stages2)));
    }

}