package org.example.chapter8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Example5Test {

    @Test
    void test() {
        Example5 example5 = new Example5();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(example5.solution(genres, plays)));

        String[] genres2 = {"classic"};
        int[] plays2 = {500};
        System.out.println(Arrays.toString(example5.solution(genres2, plays2)));

        String[] genres3 = {"classic", "pop", "classic", "pop", "mm", "mm", "classic"};
        int[] plays3 = {500, 400, 800, 200, 100, 50, 300};
        System.out.println(Arrays.toString(example5.solution(genres3, plays3)));

        String[] genres4 = {"classic", "tt"};
        int[] plays4 = {100, 500};
        System.out.println(Arrays.toString(example5.solution(genres4, plays4)));

        String[] genres5 = {"classic", "tt", "classic", "classic"};
        int[] plays5 = {100, 500, 150, 200};
        System.out.println(Arrays.toString(example5.solution(genres5, plays5)));
    }

}