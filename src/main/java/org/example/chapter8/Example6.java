package org.example.chapter8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example6 {
    public int[] solution(String[] id_list, String[] report, int k) {
        /**
         * 신고 결과 받기
         * 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
         * k번 이상 신고된 유저는 정지 됩니다.
         * 그리고 정지된 유저를 신고한 사람은 메일로 알림을 받게 됩니다.
         *
         * 의사 코드
         * 1. id_list 사용해서 사용자 해쉬맵을 만든다.
         * 2. report 순환하면서 신고 당한 사람의 카운트를 저장한다.
         * 3. 각 사용자가 신고한 사용자들의 목록을 저장한다.
         * 4. k번 이상 신고된 유저를 추출한다.
         * 5. 각각의 결과를 뽑아 낸다.
         */
        HashMap<String, Integer> reportMap = new HashMap<>();
        HashMap<String, ArrayList<String>> reportUserHistory = new HashMap<>();
        for (String s : id_list) {
            reportMap.put(s, 0);
            reportUserHistory.put(s, new ArrayList<>());
        }

        for (String s : report) {
            String[] temp = s.split(" ");
            String reportUser = temp[0];
            String reportedUser = temp[1];

            ArrayList<String> reportHistory = reportUserHistory.get(reportUser);
            if (!reportHistory.contains(reportedUser)) {
                reportMap.put(reportedUser, reportMap.getOrDefault(reportedUser, 0) + 1);
                reportUserHistory.get(reportUser).add(reportedUser);
            }
        }

        ArrayList<String> stoppedUsers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : reportMap.entrySet()) {
            int stoppedUser = entry.getValue();
            if (stoppedUser >= k) {
                stoppedUsers.add(entry.getKey());
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (String s : id_list) {
            ArrayList<String> reportUsers = reportUserHistory.get(s);
            long count = stoppedUsers.stream().filter(reportUsers::contains).count();
            answer.add((int) count);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
