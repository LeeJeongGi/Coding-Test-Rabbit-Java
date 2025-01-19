package org.example.chapter5;

import org.junit.jupiter.api.Test;

class Example5Test {

    @Test
    void test() {
        Example5 exam = new Example5();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] result = exam.solution(arr1, arr2);
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

}