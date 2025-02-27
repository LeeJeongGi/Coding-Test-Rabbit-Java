package org.example.exam1;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Example1 {

    int[][] array;
    String answer = null;
    StringBuilder route;
    char[] dir = {'d', 'l', 'r', 'u'};
    int[] rdir = {1, 0, 0, -1};
    int[] cdir = {0, -1, 1, 0};
    int endRow, endCol;
    int arrRow, arrCol; //미로 길이

    public String solution(int n, int m, int x, int y, int r, int c, int k) {

        /**
         * 미로 탈출 명령어.
         *
         * 1. n * m 격자가 있음.
         * 2. x,y -> r,c 로 이동해야함.
         * 3. k번 이동해서 도착해야 한다.
         * 4. 도착할 수 있는 경우의 수중 사전순으로 정렬해서 맨 앞에 있는거 리턴.
         * 5. 이동 경우의 수는 총 4가지 방향, l,r,u,d(left, right, up, down 인듯?)
         *
         * 의사 코드.
         * 1. 격자 배열을 만든다.
         * 2. x,y 부터 시작해서 사방으로 이동하기 시작한다.
         * 3. 한번만 이동해야 한다.
         * 4. dfs로 k번 이동해서 끝에 r,c에 도착하면 배열에 넣어준다.
         */

        route = new StringBuilder();
        array = new int[n][m];
        endRow = r; endCol = c;
        arrRow = n; arrCol = m;
        //최단거리 계산 - 거리 k로 갈 수 있는지 여부
        int length = distance(x, y, r, c);
        if((k - length) % 2 == 1 || k < length) return "impossible";
        dfs(x, y, 0, k);

        return answer == null ? "impossible" : answer;
    }

    private int distance(int x, int y, int r, int c){
        return (int)Math.abs(x-r) + (int)Math.abs(y-c);
    }

    private void dfs(int r, int c, int depth, int k){

        if(answer != null) return;
        if(depth + distance(r, c, endRow, endCol) > k) return; //현재 깊이 + 남은 거리 > k
        if(k == depth) {
            answer = route.toString();
            return;
        }
        for(int i=0; i<4; i++){

            int nextRow = r + rdir[i];
            int nextCol = c + cdir[i];
            if(nextRow <= arrRow && nextCol <= arrCol && nextRow > 0 && nextCol >0){
                route.append(dir[i]);
                dfs(nextRow, nextCol, depth+1, k);
                route.delete(depth, depth+1);
            }

        }

    }
}
