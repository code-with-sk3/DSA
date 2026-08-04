class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int st = Integer.MAX_VALUE;
        int en = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<st){
                st = nums[i];
            }
            if(nums[i]>en){
                en = nums[i];
            }

            set.add(nums[i]);
        }
        for(int i=st;i<=en;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}