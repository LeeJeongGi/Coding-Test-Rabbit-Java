package org.example.chapter8;

import java.util.HashSet;

public class Example1 {
    public boolean solution(int[] arr, int target) {

        /**
         * 두 수의 합.
         * 배열이 주어졌을 때 두 개의 수를 더해서 target을 만들 수 있는지 검사
         * 있으면 true, 없으면 false
         *
         * 의사 코드.
         * 1. 배열 크기만큼 루프를 돈다. for 두번.
         * 2. target을 만들 수 있으면 true
         */

        /* 완전 탐색으로 푸는 방법
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }

        return false;
        */

        /**
         * 해시 셋을 활용한다.???
         * x + k = target
         * k = target - x = 이 값이 배열에 있는지 검증하면 된다.
         * 즉 헤시 셋을 활용해서 한 번에 찾는다?
         */
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            if (hs.contains(target - i)) {
                return true;
            }

            hs.add(i);
        }

        return false;
    }
}
