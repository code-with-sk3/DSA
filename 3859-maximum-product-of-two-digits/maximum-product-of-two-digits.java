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
        int[] ar = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ar[i] = arr.get(i);
        }
        for(int i : arr){
            if(i>max){
                max = i;
            }
        }
        
        for(int i=0;i<ar.length;i++){
            if(ar[i]==max){
                ar[i] = 0;
                break;
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]>smax || ar[i]==max){
                smax = ar[i];
            }
        }
        return max*smax;
    }
}