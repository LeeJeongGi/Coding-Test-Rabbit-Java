package org.example.chapter6;

public class Example5 {
    public int[] solution(int[] prices) {

        /**
         * 주식 가격
         * 초 단위로 기록된 주식가격이 담긴 배열이 주어진다.
         * 가격이 떨어지지 않는 기간은 몇초인지?
         *
         * 의사 코드.
         * 1. 길이가 10,000 밖에 되지 않기 때문에 완전 탐색해도 될듯?
         * 다만. 스텍 문제여서 활용해보자면,,
         * 2. 에이,,,모르것다 완.탐 돌리자.
         * 3. 길이 만큼 for문 두번 돌면서 자기보다 큰게 언제 나오는지 체크
         * 4. 최악이라고 해봤자,,, n * (n-1) * (n-2) .. 아닌가?
         */

        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int cnt = 0;

            for (int j = i + 1; j < prices.length; j++) {
                cnt++;

                if (prices[i] > prices[j]) {
                    answer[i] = cnt;
                    break;
                }
            }

            if (answer[i] == 0) {
                answer[i] = cnt;
            }
        }

        return answer;
    }
}
