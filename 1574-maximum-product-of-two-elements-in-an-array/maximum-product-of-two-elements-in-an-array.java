class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int j = 0;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int smax = nums[nums.length-2];
        return (max-1)*(smax-1);
    }
}