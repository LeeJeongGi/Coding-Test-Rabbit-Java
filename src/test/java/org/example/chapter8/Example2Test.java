package org.example.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {

    @Test
    void test() {
        Example2 example2 = new Example2();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(example2.solution(participant, completion));
    }

}