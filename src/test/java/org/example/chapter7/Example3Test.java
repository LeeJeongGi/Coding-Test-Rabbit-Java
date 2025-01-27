package org.example.chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example3Test {

    @Test
    void test() {
        Example3 example3 = new Example3();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(example3.solution(cards1, cards2, goal));

        String[] cards3 = {"i", "water", "drink"};
        String[] cards4 = {"want", "to"};
        String[] goal1 = {"i", "want", "to", "drink", "water"};

        System.out.println(example3.solution(cards3, cards4, goal1));
    }

}