class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if(arr1.getLast()  >  arr2.getLast()){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }

        int size1 = arr1.size();
        int size2 = arr2.size();

        int[] ans = new int[size1 + size2];
        for(int i=0;i<size1;i++){
            ans[i] = arr1.get(i);
        }
        for(int i=0;i<size2;i++){
            ans[size1+i] = arr2.get(i);
        }

        return ans;
    }
}