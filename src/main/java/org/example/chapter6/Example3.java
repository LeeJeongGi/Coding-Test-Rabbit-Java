package org.example.chapter6;

import java.util.HashMap;
import java.util.Stack;

public class Example3 {
    public int solution(String s) {
        /**
         * 괄호 회전하기
         * 대괄호, 소괄호, 중괄로 이루어진 문자열이 주어집니다.
         * 이 문자열 s 왼쪽으로 x 칸만큼 회전시켰을 s가 올바른 괄호 문자열이 되게 하는 x의 개수
         *
         * 의사 코드.
         * 1. 결국 x번 이동해서 올바른지 판단하면 될듯?
         * 2. 올바른 괄호인지 판별하는 방법은 stack에 넣어서 판별
         * 3. 다만 소,중,대 괄호로 종류가 3개나 되기 때문에 효율적으로 검증하는 방법은 생각해보기.
         *
         * 그냥 생각나는 데로 풀었는데, 우선 시간이 오래 걸리는 이유는
         * 문자열을 매번 새로 만들어서 오래 걸린다.
         *
         * 새로 만든 문자열마다 검증을 해서 올바른 문자열인지 판단하기 때문에 오래걸린다.
         *
         * 책에서 아주 신박한 방법으로 풀었음.
         * 1. HashMap 이용해서 소,중,대 괄호 key, value로 관리하는 방법!!
         *  1-1. HashMap에 ('}', '{'), (']', '[') 이런식으로 관리하는 방법!!
         *  1-2. 생각지도 못했음. 근데 아주 효율적인듯.
         * 2. 문자열을 새로만들 필요 없음. 동일한 문자열을 한번 더 이어 붙이면 된다.
         *  2-1. (){}[] + (){}[] 이렇게 해서 인덱스로 문자열을 잘라서 검증하면 된다.
         *  2-2. 아주 좋은 아이디어 인듯.
         */
        int answer = 0;
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');

        int len = s.length();
        s += s;

        A: for (int i = 0; i < len; i++) {
            Stack<Character> stack = new Stack<>();
            for (int j = i; j < len + i; j++) {

                if (!hm.containsKey(s.charAt(j))) {
                    stack.push(s.charAt(j));
                } else {
                    if (stack.isEmpty()) {
                        continue A;
                    }

                    if (stack.peek() != hm.get(s.charAt(j))) {
                        continue A;
                    }

                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }

}
