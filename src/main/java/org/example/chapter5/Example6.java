package org.example.chapter5;

import java.util.*;

public class Example6 {
    public int[] solution(int N, int[] stages) {

        /**
         * 실패율
         * 스테이지 갯수 N, 현재 스테이지에 머물러 있는 스테이지 배열 stages
         * 현재 스테이지에 있는 인원 / 스테이지 갯수 N
         * 실패율을 내림 차순으로 정렬?
         *
         * 의사 코드
         * 1. stages 배열에 담겨 있는 결과를 해쉬맵으로 한번 풀어야 할듯 복잡도 : N
         * 2. 첫 번째 문제 몇 명있는지.. 두 번째 스테이지에 몇 명있는지.. 이런식으로
         * 3. 각 해쉬 맵에서 스테이지를 계산해서 배열에 담기
         * 4. 다만 실패율이 같을 경우 스테이지 번호가 앞에 있는 것부터 담기.(걍 앞에서 부터 계싼하면 자연 스럽게 해결되는거 아닌가?)
         */

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            hm.put(i, 0);
        }

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] > N) {
                continue;
            }
            hm.put(stages[i], hm.get(stages[i]) + 1);
        }

        HashMap<Integer, Double> result = new HashMap<>();
        int totalPeople = stages.length;
        for (Integer i : hm.keySet()) {
            if (hm.get(i) == 0) {
                result.put(i, 0.0);
            } else {
                result.put(i, (double) hm.get(i) / totalPeople);
                totalPeople -= hm.get(i);
            }
        }

        List<Map.Entry<Integer, Double>> entries = new ArrayList<>(result.entrySet());
        Collections.sort(entries, (o1, o2) -> {
            int valueComparison = Double.compare(o2.getValue(), o1.getValue());
            if (valueComparison != 0) {
                return valueComparison;
            } else {
                return Integer.compare(o1.getKey(), o2.getKey());
            }
        });

        int[] answer = new int[entries.size()];
        for (int i = 0; i < entries.size(); i++) {
            answer[i] = entries.get(i).getKey();
        }

        return answer;
    }
}
