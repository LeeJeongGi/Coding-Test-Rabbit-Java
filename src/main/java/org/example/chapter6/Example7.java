package org.example.chapter6;

import java.util.Arrays;
import java.util.Stack;

public class Example7 {
    public String solution(int n, int k, String[] cmd) {
        /**
         * 표 편집
         * 쉽지 않네..우선 엑셀 표 처럼 뭔가 있음.
         * k 가 선택된 행이라는 의미인데 선택된 행을 어떻게 끌고갈지 고민좀.
         * cmd 는 명령어임.
         * 결국 z를 해야 하니 스택에 수행한 작업을 저장해야 함.
         * 그래야지 순서대로 복구할 수 있음.
         *
         * 문제에 힌트가 있는거 같음. 우선 해쉬맵 형태로 저장을 할꺼고 인덱스는 음 고민해보자.
         * 어차피 해쉬맵으로 찾아야 바로 찾을 수 있으니.
         *
         * 의사 코드.
         * 1. 해당 위치 즉 index에서 down, up을 할 때 몇 번째 인덱스로 가야 하는지 정하는 배열 생성
         * 2. cmd 명령어를 처리 한다.
         * 3.
         */
        int[] up = new int[n + 2];
        int[] down = new int[n + 2];
        for (int i = 0; i < n + 2; i++) {
            up[i] = i - 1;
            down[i] = i + 1;
        }
        k++;

        Stack<Integer> delete = new Stack<>();
        for (String temp : cmd) {
            if (temp.startsWith("C")) {
                delete.push(k);
                down[up[k]] = down[k];
                up[down[k]] = up[k];

                k = n < down[k] ? up[k] : down[k];
            } else if (temp.startsWith("Z")) {
                int restore = delete.pop();
                down[up[restore]] = restore;
                up[down[restore]] = restore;
            } else {
                String[] s = temp.split(" ");
                int x = Integer.parseInt(s[1]);
                for (int j = 0; j < x; j++) {
                    k = s[0].equals("U") ? up[k] : down[k];
                }
            }
        }

        char[] answer = new char[n];
        Arrays.fill(answer, 'O');

        for (Integer i : delete) {
            answer[i - 1] = 'X';
        }

        return new String(answer);
    }
}
