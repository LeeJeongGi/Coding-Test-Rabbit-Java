package org.example.chapter6;

import java.util.Stack;

public class Example6 {
    public int solution(int[][] board, int[] moves) {
        /**
         * 크레인 인형 뽑기
         * 격자모양 판이 주어지고 인형 뽑기 크레인이 움직이는 배열이 주어진다.
         * 인형을 바구니에 담고 최종적으로 몇개 터졌는지 카운트해서 반환하면 된다.
         *
         * 의사 코드.
         * 1. board 배열 확인하기.
         * 2. moves 루프 돌면서 인형 스텍에 담기
         * 3. 스택에 담기전 체크 사항, peek 값이랑 동일 하다면?
         *  3-1. 결과 +2 하고 stack pop
         *  3-2. 다르면 push
         * 4. 최종적으로 인형 터진 갯수 리턴
         */
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        A: for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int current = board[j][moves[i] - 1];

                if (current != 0) {
                    if (!stack.isEmpty() && stack.peek() == current) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(current);
                    }
                    board[j][moves[i] - 1] = 0;
                    continue A;
                }
            }
        }

        return answer;
    }
}
