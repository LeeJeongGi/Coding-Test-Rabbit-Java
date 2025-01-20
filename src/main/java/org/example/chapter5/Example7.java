package org.example.chapter5;

import java.util.HashSet;

public class Example7 {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(String dirs) {

        /**
         * 방문 길이
         * U: 위쪽으로 한 칸 가기
         * D: 아래쪽으로 한 칸 가기
         * R: 오른쪽으로 한 칸 가기
         * L: 왼쪽으로 한 칸 가기
         *
         * 이런 명령어가 있음. 딱봐도 dirs 배열에 저 명령어가 들어올 것 같음..
         * 의사 코드
         * 1. dirs 배열대로 (0,0) 에서 시작해서 움직인다.
         *  1-1. 원안에 있는지 검사 (상하좌우 -5 ~ 5)
         *  1-2. 이미 가본 길인지 검증. 가봤다면 그냥 다음꺼 진행, 안가봤다면 결과에 +1
         * 2. 이미 가본 길인지 검증하기 위해 2차원 배열을 만든다.
         *  2-1. 0,0 에서 시작하면 뒤로가거나 왼쪽으로 이동할 때 검사하기 어렵기 때문에 5,5에서 시작하게 셋팅하면 된다.
         */
        HashSet<String> hs = new HashSet<>();
        Point start = new Point(5, 5);

        for(int i = 0; i < dirs.length(); i++) {
            char ch = dirs.charAt(i);
            int index = 0;
            if (ch == 'L') {
                index = 0;
            } else if (ch == 'U') {
                index = 1;
            } else if (ch == 'R') {
                index = 2;
            } else if (ch == 'D') {
                index = 3;
            }

            int nextX = start.x + dx[index];
            int nextY = start.y + dy[index];
            if(0 <= nextX && nextX < 11 && 0 <= nextY && nextY < 11) {
                hs.add(start.x + " " + start.y + " " + nextX + " " + nextY);
                hs.add(nextX + " " + nextY + " " + start.x + " " + start.y);

                start = new Point(nextX, nextY);
            }
        }

        return hs.size() / 2;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
