package org.example.chapter5;

import java.util.ArrayList;

public class Example3 {
    public int[] solution(int[] numbers) {
        /**
         * 두 개 뽑아서 더하기
         * numbers 배열에서 두 개의 수를 뽑아 만들 수 있는 모든 경우의 수를 오름차순으로 정렬
         * numbers 길이는 2이상 100이하 (완전 탐색 가능)
         *
         * 의사 코드
         * 1. 전체 경우에 대한 더하기를 특정 배열에 담는다.
         *  1-1. 중복이라면 제거해야 한다.
         * 2. 오름차순 정렬을 한다.
         * 3. 결과를 반환한다.
         */
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                result.add(sum);
            }
        }

        return result.stream()
                .distinct()
                .sorted()
                .mapToInt(i -> i)
                .toArray();
    }
}
