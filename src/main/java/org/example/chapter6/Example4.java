package org.example.chapter6;

import java.util.Stack;

public class Example4 {
    public int solution(String s) {
        /**
         * 짝 지어 제거하기
         * 동일한 소문자 문자열이 있으면 찾아서 제거하고 문자열 붙이기..
         * 스택을 이용하면 쉽게 풀 수 있음.
         *
         * 의사 코드.
         * 1. 문자열 길이만큼 루프문을 만든다.
         * 2. 스택을 생성한다.
         * 3. 스택에 있는 값과 다음 값을 비교한다.
         *  3-1. 같으면 뺀다.
         *  3-2. 다르면 넣는다.
         * 4. 최종적으로 마지막에 스택이 비어 있는지 여부로 확인.
         */
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
