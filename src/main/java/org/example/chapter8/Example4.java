package org.example.chapter8;

import java.util.ArrayList;
import java.util.HashMap;

public class Example4 {
    public String[] solution(String[] record) {
        /**
         * 오픈 채팅방
         *
         * 누구 ~ 들어왔습니다.
         * 누구 ~ 나갔습니다.
         * 결과 리턴해주기
         *
         * 의사 코드
         * 1. record 배열 분석
         *  1-1 각각 enter, leave, change 명령어 구분
         *  1-2 enter, leave 일 경우 순서대로 저장.
         * 2. 최종적으로 어떤 메세지를 리턴해야 하는지 만들어서 리턴하기.
         */
        HashMap<String, String> userInfo = new HashMap<>();
        ArrayList<String> works = new ArrayList<>();
        for (String s : record) {
            String[] temp = s.split(" ");

            if ("Enter".equals(temp[0])) {
                works.add(temp[0] + " " + temp[1]);
                userInfo.put(temp[1], temp[2]);
            } else if ("Leave".equals(temp[0])) {
                works.add(temp[0] + " " + temp[1]);
            } else if ("Change".equals(temp[0])) {
                userInfo.put(temp[1], temp[2]);
            }
        }

        String[] answer = new String[works.size()];
        for (int i = 0; i < works.size(); i++) {
            String[] temp = works.get(i).split(" ");
            if (temp[0].equals("Enter")) {
                answer[i] = userInfo.get(temp[1]) + "님이 들어왔습니다.";
            } else if (temp[0].equals("Leave")) {
                answer[i] = userInfo.get(temp[1]) + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}
