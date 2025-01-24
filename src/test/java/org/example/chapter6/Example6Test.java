package org.example.chapter6;

import org.junit.jupiter.api.Test;

class Example6Test {

    @Test
    void test() {
        Example6 example6 = new Example6();
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(example6.solution(board, moves));
    }

}