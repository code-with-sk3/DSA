class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int[] val = {26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int i=1;i<=s.length();i++){
            char ch = s.charAt(i-1);
            for(int j=0;j<26;j++){
                if(c[j]==ch){
                    ans = ans+val[j]*i;
                }
            }
        }
        return ans;
    }
}