package org.example.chapter6;

import org.junit.jupiter.api.Test;

class Example7Test {

    @Test
    public void test() {
        Example7 exam = new Example7();
        int n = 8;
        int k = 2;
        String[] cmd = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"};

        System.out.println(exam.solution(n, k, cmd));

        String[] cmd2 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"};
        System.out.println(exam.solution(n, k, cmd2));
    }

}