package org.example.chapter5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example4 {
    public int[] solution(int[] answers) {
        /**
         * 모의 고사
         * 1,2,3 번의 수포자가 찍는 방법의 배열? 루틴? 그런게 있음 반복적으로 일어남.
         * answers 배열에 정답 번호가 입력되는데 최대 10,000번 입력된다고 함.
         * 딱히 N^2 으로 푸는게 아니라 상관 없을 듯?
         * 걍 완전 탐색으로 수포자 3명 루프 돌리면 될듯
         * N * 3 -> N -> 만번.
         *
         * 의사 코드
         * 1. 1번 수포자 정답 체크
         * 2. 2번 수포자 정답 체크
         * 3. 3번 수포자 정답 체크
         * 4. 가장 많이 맞춘 사람 체크
         * 5. 동점이든 뭐든 가장 많이 맞춘 사람 리턴
         */

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == person1[i % person1.length]) {
//                hm.put(1, hm.getOrDefault(1, 0) + 1);
                result1++;
            }

            if (answers[i] == person2[i % person2.length]) {
//                hm.put(2, hm.getOrDefault(2, 0) + 1);
                result2++;
            }

            if (answers[i] == person3[i % person3.length]) {
//                hm.put(3, hm.getOrDefault(3, 0) + 1);
                result3++;
            }
        }

        int maxValue = Math.max(result1, Math.max(result2, result3));
        ArrayList<Integer> result = new ArrayList<>();
        if (maxValue == result1) {
            result.add(1);
        }

        if (maxValue == result2) {
            result.add(2);
        }

        if (maxValue == result3) {
            result.add(3);
        }

//        int maxValue = Integer.MIN_VALUE;
//        for (Integer i : hm.values()) {
//            if (maxValue < i) {
//                maxValue = i;
//            }
//        }
//
//        ArrayList<Integer> result = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//            if (entry.getValue() == maxValue) {
//                result.add(entry.getKey());
//            }
//        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
