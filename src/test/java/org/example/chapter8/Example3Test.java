package org.example.chapter8;

import org.junit.jupiter.api.Test;

class Example3Test {

    @Test
    void test() {
        Example3 example3 = new Example3();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(example3.solution(want, number, discount));
    }

}