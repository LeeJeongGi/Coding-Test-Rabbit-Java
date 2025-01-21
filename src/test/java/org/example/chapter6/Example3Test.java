package org.example.chapter6;

import org.junit.jupiter.api.Test;

class Example3Test {

    @Test
    void test() {
        Example3 example3 = new Example3();
        String s1 = "[](){}";
        System.out.println(example3.solution(s1));

        String s2 = "}]()[{";
        System.out.println(example3.solution(s2));

        String s3 = "[)(]";
        System.out.println(example3.solution(s3));

        String s4 = "}}}";
        System.out.println(example3.solution(s4));
    }

}