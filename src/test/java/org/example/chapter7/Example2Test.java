package org.example.chapter7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {

    @Test
    void test() {
        Example2 example2 = new Example2();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(example2.solution(progresses, speeds)));

        int[] progresses1 = {95, 90, 99, 99, 80, 99};
        int[] speeds1 = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(example2.solution(progresses1, speeds1)));
    }

}