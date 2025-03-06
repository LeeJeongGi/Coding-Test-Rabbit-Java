package org.mad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {

    @Test
    public void example1() {
        Example1 example1 = new Example1();
        int n = 5;
        int[][] prices = {
                {1, 900},
                {3, 700},
                {4, 1200}
        };
        int[] order = {3, 5, 2, 3, 1, 5, 2, 3, 4, 1};
        int cost = 500;
        System.out.println(example1.solution(n, prices, order, cost));

        int n2 = 999;
        int[][] prices2 = {
                {123, 25},
                {777, 150}
        };
        int[] order2 = {1, 1, 2, 3, 5, 8, 777, 777, 777};
        int cost2 = 30;

        System.out.println(example1.solution(n2, prices2, order2, cost2));
    }

}