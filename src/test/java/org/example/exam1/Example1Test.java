package org.example.exam1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {

    @Test
    public void test() {
        Example1 example1 = new Example1();
        example1.solution(3, 4, 2, 3, 3, 1, 5);
    }

}