package org.example.chapter7;

import java.util.ArrayDeque;
import java.util.Queue;

public class Example3 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        /**
         * 카드 뭉치
         * 두 개의 카드 뭉치가 있다.
         * 이 때 goal의 단어를 만들 수 있는지 없는지 검사한다.
         * 카드 뭉치에서 카드는 순서대로 사용가능하다. 여기서 큐를 이용하면 된다고 생각하면 된다.
         *
         * 의사 코드.
         * 1. 카드 뭉치 card1, card2 큐에 넣는다.
         * 2. goal 길이만큼 루프를 돈다.
         *  2-1. goal 단어가 card1, card2 에 있는지 검사한다.
         *  2-2. 없으면 바로 return No
         *  2-3. 있으면 반복. (있는 카드 뭉치에서 단어 빼고..)
         * 3. goal 루프를 정상적으로 완료 하면 YES 리턴
         */

        Queue<String> oneCard = new ArrayDeque<>();
        Queue<String> twoCard = new ArrayDeque<>();

        for (String s : cards1) {
            oneCard.offer(s);
        }

        for (String s : cards2) {
            twoCard.offer(s);
        }

        A: for (int i = 0; i < goal.length; i++) {
            String temp = goal[i];

            if (!oneCard.isEmpty() && oneCard.peek().equals(temp)) {
                oneCard.poll();
                continue A;
            }

            if (!twoCard.isEmpty() && twoCard.peek().equals(temp)) {
                twoCard.poll();
                continue A;
            }

            return "No";
        }

        return "Yes";
    }
}
