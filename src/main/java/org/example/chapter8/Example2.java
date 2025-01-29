package org.example.chapter8;

import java.util.HashMap;

public class Example2 {
    public String solution(String[] participant, String[] completion) {

        /**
         * 완주하지 못한 선수
         *
         * 한 명 빼고는 다 완주 한다.?
         *
         * 의사 코드
         * 1. 완주한 사람 해쉬셋이 넣는다.
         * 2. 참여자들 루프 돌면서 헤시셋에서 찾는다.
         * 3. 없으면 바로 리턴
         */
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : completion) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        for (String s : participant) {
            if (hm.getOrDefault(s, 0) == 0) {
                return s;
            }

            hm.put(s, hm.getOrDefault(s, 0) - 1);
        }

        return null;
    }
}
