package org.mad;

public class Example2 {
    public int solution(int[][] grid) {

        /**
         * 격자 이동?
         *
         * 의사 코드.
         * 1. 각 순간마다 최적의 판단을 하면 된다.
         * 2. 예를 들어 (2,2) 좌표부터 (왼쪽 -> 오른쪽), (위 -> 아래) 최소값을 구하면서 가면 될것 같다.
         * 3. 다만 첫 열과, 첫 행을 미리 계산해서 넣어준다.
         * 4. 루프를 돌면서 최적의 판단만 하면 되기 때문에 복잡도는 n^2 예상.
         * 5. 최대 주어지는 배열 크기가 1000 * 1000 이기 때문에 충분할 것이라 생각 된다.
         */
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[grid.length - 1][grid[0].length - 1];
    }
}
