package org.mad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {

    @Test
    void example1() {
        Example2 example2 = new Example2();
        int[][] grid = {
                {1, 2},
                {3, 4}
        };

        int[][] grid2 = {
                {1, 8, 3, 2},
                {7, 4, 6, 5}
        };

//        System.out.println(example2.solution(grid));
        System.out.println(example2.solution(grid2));
    }

}