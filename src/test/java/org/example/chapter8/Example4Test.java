package org.example.chapter8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Example4Test {

    @Test
    void test() {
        Example4 example4 = new Example4();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(example4.solution(record)));
    }

}