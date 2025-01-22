package org.example.chapter6;

import org.junit.jupiter.api.Test;

class Example4Test {

    @Test
    void test() {
        Example4 example4 = new Example4();
        String s = "baabaa";
        System.out.println(example4.solution(s));

        String s1 = "cdcd";
        System.out.println(example4.solution(s1));
    }

}