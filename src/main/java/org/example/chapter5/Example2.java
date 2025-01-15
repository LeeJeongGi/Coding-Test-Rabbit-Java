package org.example.chapter5;

import java.util.*;
import java.util.stream.Collectors;

public class Example2 {
    public int[] solution(int[] arr) {

        /**
         * 정수 배열을 파라미터로 받습니다.
         * 중복 값을 제거하고 내림차순으로 정렬한 값을 리턴합니다.
         *
         * 1. 배열의 중복 값을 없앤다.
         * 2. 정렬한다.
         * 3. 리턴한다.
         */
        ArrayList<Integer> result = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));

        return result.stream().mapToInt(i -> i).toArray();
    }
}
