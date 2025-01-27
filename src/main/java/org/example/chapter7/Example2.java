package org.example.chapter7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Example2 {
    public int[] solution(int[] progresses, int[] speeds) {

        /**
         * 기능 개발
         * 각 기능은 진도가 100%일 때 배포가 가능하다.
         * 기능은 앞에 있는 것보다 먼저 개발될 순 있지만 먼저 배포될 수는 없다.
         *
         * 의사 코드.
         * 1. 각 기능마다 작업이 완료 되는지 며칠 걸리는지 계산.
         * 2. 계산 결과를 큐에 담고.
         * 3. 큐가 비어 있지 않다면?
         *  3-1. 하나 빼서 그거보다 큰 숫자가 나올 때까지 계쏙 카운트하고 뺀다.
         *  3-2. 큰 숫자가 나오면 그 숫자 결과 배열에 담기.
         */
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            int rest = (100 - progresses[i]) % speeds[i];
            int workDay = (100 - progresses[i]) / speeds[i];

            int progress = rest == 0 ? workDay : workDay + 1;
            queue.add(progress);
        }

        int temp = 0;
        int cnt = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()) {
            temp = queue.poll();
            cnt++;

            while (!queue.isEmpty() && queue.peek() <= temp) {
                queue.poll();
                cnt++;
            }

            result.add(cnt);
            cnt = 0;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
