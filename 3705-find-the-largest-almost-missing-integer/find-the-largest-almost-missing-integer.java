class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count this number only once for this subarray
            for (Integer x : set) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }

        int ans = -1;

        for (Integer x : map.keySet()) {
            if (map.get(x) == 1) {
                ans = Math.max(ans, x);
            }
        }

        return ans;
    }
}