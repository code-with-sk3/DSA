class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048;

        boolean[] pair = new boolean[MAX];

        int n = nums.length;

        // All possible XORs of (j, k) where j <= k
        for (int j = 0; j < n; j++) {
            for (int k = j; k < n; k++) {
                pair[nums[j] ^ nums[k]] = true;
            }
        }

        boolean[] seen = new boolean[MAX];

        // Combine every number with every possible pair XOR
        for (int num : nums) {
            for (int x = 0; x < MAX; x++) {
                if (pair[x]) {
                    seen[num ^ x] = true;
                }
            }
        }

        int ans = 0;
        for (boolean b : seen) {
            if (b) ans++;
        }

        return ans;
    }
}