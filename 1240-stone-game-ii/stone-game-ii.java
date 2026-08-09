class Solution {

    int[][] dp;
    int[] suffix;

    public int stoneGameII(int[] piles) {

        int n = piles.length;

        dp = new int[n][n + 1];
        suffix = new int[n + 1];

        // Suffix sum
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return solve(0, 1, piles);
    }

    int solve(int i, int M, int[] piles) {

        int n = piles.length;

        // No piles remaining
        if (i >= n) {
            return 0;
        }

        // Take all remaining piles
        if (2 * M >= n - i) {
            return suffix[i];
        }

        if (dp[i][M] != 0) {
            return dp[i][M];
        }

        int ans = 0;

        for (int x = 1; x <= 2 * M; x++) {

            int nextM = Math.max(M, x);

            int opponent = solve(i + x, nextM, piles);

            int current = suffix[i] - opponent;

            ans = Math.max(ans, current);
        }

        dp[i][M] = ans;

        return ans;
    }
}