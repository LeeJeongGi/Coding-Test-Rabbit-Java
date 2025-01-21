package org.example.chapter6;

import java.util.Stack;

public class Example1 {
    public boolean solution(String s) {

        /**
         * 몸 풀기 문제.
         * 스택하면 떠오르는 대표적인 문제는 괄호 문제임.
         *
         * ( 이렇게 열려 있으면 반드시 ) 닫혀야 한다
         * 문자열이 주어지면 true, false 로 반환한다.
         *
         * 의사 코드
         * 1. 받은 문자열 char 형태로 루프 돌면서 체크 할꺼임.
         *  1-1. '(' 면 스택에 넣고
         *  1-2. ')' 면 스택에서 꺼내서 비교한다.
         * 2. 검증 다 통과하면 스택이 비어 있으면 true 아니면 false
         *
         */
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            stack.pop();
        }

        return stack.isEmpty();
    }
}
