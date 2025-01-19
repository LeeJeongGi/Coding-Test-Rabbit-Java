package org.example.chapter5;

public class Example5 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        /**
         * 행렬의 곱셈
         * 2차원 행렬 두개를 받아서 곱셈해서 결과를 리턴하는 문제.
         * 행렬의 곱셈 저번에 코테 문제 풀때도 나와서 한 번 해봐야겠음.
         * 단순하긴 함
         *
         * 의사 코드
         * 1. 3 x 2, 2 x 3 이런식으로 열과 행의 숫자가 같아야 한다. -> 항상 곱할 수 있는 배열만 준다고 함.
         * 2. 만들어지는 배열의 크기는? 첫 번째 배열의 행, 두 번째 배열의 열 크기 만큼 생성
         * 3. 그 다음에 첫 번째 배열의 00, 01,02 .. 즉 가로 길이 만큼 이랑 세로 길이 만큼 더하기??
         * 4. 직접 만들어봐야겠다. 행렬 한번도 해본적 없나..?
         * 5. C[i][j] = Σ (A[i][k] * B[k][j])  (k는 0부터 n-1까지의 정수)
         */


        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }

        return answer;
    }
}
