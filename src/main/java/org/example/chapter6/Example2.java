package org.example.chapter6;

import java.util.Stack;

public class Example2 {
    public String solution(int value) {

        /**
         * 몸 풀기 문제 2번째 문제.
         * 10진수를 2진수르 바꾸기!!
         * 사실 함수쓰면 되긴 하는데 Stack 활용하는 문제니깐 직접 해본다..
         *
         * 의사코드
         * 1. 파라미터로 받은 값을 2로 나눈다.
         * 2. 나머지를 스텍에 넣는다.
         * 3. 파라미터로 받은 값이 1이 될 때 까지 반복한다.
         * 4. 스택에 있는 값을 하나씩 꺼내서 반환 한다.
         */

        Stack<Integer> stack = new Stack<>();
        while (value > 0) {
            stack.push(value % 2);
            value /= 2;
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return builder.toString();
    }
}
