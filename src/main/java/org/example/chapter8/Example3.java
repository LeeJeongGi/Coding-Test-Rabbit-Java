package org.example.chapter8;

import java.util.HashMap;

public class Example3 {
    public int solution(String[] want, int[] number, String[] discount) {
        /**
         * 할인 행사
         * 누가 원하는 상품 목록과 갯수를 적어 준다.
         * discount 할인 목록이 주어 질 때 원하는 상품을 모두 살 수 있는 일수??
         *
         * 의사 코드.
         * 1. 상품 목록과 갯수를 해쉬 맵에 저장
         * 2. discount 전체 루프 돌면서 확인?
         *  2-1 어차피 개수는 10개이기 때문에 10번만 돌면 된다.
         *  2-2 10번 돌면서 해쉬맵에 담는다.
         * 3. 마지막으로 해쉬맵을 비교해서 결과가 같으면 +1 해주면 끝
         */
        int answer = 0;

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            hm.put(want[i], number[i]);
        }

        HashMap<String, Integer> temp = new HashMap<>();
        A: for (int i = 0; i <= discount.length - 10; i++) {
            for (int j = i; j < i + 10; j++) {
                temp.put(discount[j], temp.getOrDefault(discount[j], 0) + 1);
            }

            if (hm.equals(temp)) {
                answer++;
            }
            temp.clear();
        }

        return answer;
    }
}
