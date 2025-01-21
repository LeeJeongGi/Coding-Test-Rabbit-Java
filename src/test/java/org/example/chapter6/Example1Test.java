package org.example.chapter6;

import org.junit.jupiter.api.Test;

class Example1Test {

    @Test
    void test() {
        Example1 example1 = new Example1();
        String input = "()()";

        System.out.println(example1.solution(input));

        String s = "(())()";
        System.out.println(example1.solution(s));
    }

}