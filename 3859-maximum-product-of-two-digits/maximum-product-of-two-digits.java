class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int smax = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int n1 = n;
        while(n1>0){
            int x = n1%10;
            arr.add(x);
            n1 = n1/10;
        }
        Collections.sort(arr);
        max = arr.get(arr.size()-1);
        smax = arr.get(arr.size()-2);
        return max*smax;
    }
}