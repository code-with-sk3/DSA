class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(nums.length==0){
            return ans;
        }
        Arrays.sort(nums);
        int freq = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
        
            else{
                if(freq > nums.length/3){
                    ans.add(nums[i-1]);
                }
                freq = 1;
            }
        }
        if(freq>nums.length/3){
           
            ans.add(nums[nums.length-1]);
            
        }
        return ans;
    }
}