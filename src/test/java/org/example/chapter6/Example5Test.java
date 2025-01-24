package org.example.chapter6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Example5Test {

    @Test
    void test() {
        Example5 example5 = new Example5();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(example5.solution(prices)));
    }

}