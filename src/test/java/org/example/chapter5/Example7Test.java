package org.example.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example7Test {

    @Test
    void test() {
        Example7 exam = new Example7();
        String dirs = "ULURRDLLU";
        System.out.println(exam.solution(dirs));
    }

}