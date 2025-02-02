package org.example.chapter8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Example6Test {

    @Test
    void test() {
        Example6 example6 = new Example6();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        System.out.println(Arrays.toString(example6.solution(id_list, report, k)));

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 2;

        System.out.println(Arrays.toString(example6.solution(id_list2, report2, k2)));
    }

}