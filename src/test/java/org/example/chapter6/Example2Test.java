package org.example.chapter6;

import org.junit.jupiter.api.Test;

class Example2Test {

    @Test
    void test() {
        Example2 example2 = new Example2();
        int input = 10;
        System.out.println(example2.solution(input));

        int input2 = 27;
        System.out.println(example2.solution(input2));

        int input3 = 12345;
        System.out.println(example2.solution(input3));
    }

}