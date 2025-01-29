package org.example.chapter8;

import org.junit.jupiter.api.Test;

class Example1Test {

    @Test
    void test() {
        Example1 example1 = new Example1();
        int[] arr = {1, 2, 3, 4, 8};
        int target = 6;
        System.out.println(example1.solution(arr, target));

        int[] arr1 = {2, 3, 5, 9};
        int target1 = 10;
        System.out.println(example1.solution(arr1, target1));
    }

}