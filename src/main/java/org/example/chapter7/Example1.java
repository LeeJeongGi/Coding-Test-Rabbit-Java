package org.example.chapter7;

import java.util.ArrayDeque;
import java.util.Queue;

public class Example1 {
    public int solution(int N, int K) {
        /**
         * 요세푸스 문제.
         * 1번 번호표를 가진 사람을 기준으로 K번째 사람을 없앱니다.
         * 없앤 사람 다음 사람을 기준으로 하고 다시 K번째 사람을 없앱니다.
         * 마지막에 살아있는 사람의 번호를 반환하는 솔루션 함수를 만드세요.
         *
         * 의사 코드.
         * 1. 큐에 1 ~ N 자연수를 넣는다.
         * 2. cnt를 증가하고 queue에서 값을 뺀다.
         *  2-1. cnt가 K면 그냥 뺀다.
         *  2-2. cnt가 K가 아니면 다시 넣는다.
         * 3. K에 도착하면 다시 카운트 초기화
         * 4. 이 과정을 반복하다가 큐의 사이즈가 1이면 마지막 번호 리턴
         */

        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int cnt = 0;
        while (queue.size() > 1) {
            cnt++;
            int temp = queue.poll();

            if (cnt != K) {
                queue.add(temp);
            } else {
                cnt = 0;
            }
        }

        if (!queue.isEmpty()) {
            answer = queue.poll();
        }

        return answer;
    }
}
