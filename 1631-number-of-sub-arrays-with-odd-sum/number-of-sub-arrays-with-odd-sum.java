
class Solution {
    public int numOfSubarrays(int[] arr) {

        int mod = 1000000007;
        int count = 0;

        int[] presum = new int[arr.length];
        presum[0] = arr[0];

        int even = 1;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i > 0) {
                presum[i] = presum[i - 1] + arr[i];
            }

            if (presum[i] % 2 != 0) {
                count = (count + even) % mod;
                odd++;
            } 
            else {
                count = (count + odd) % mod;
                even++;
            }
        }

        return count;
    }
}
