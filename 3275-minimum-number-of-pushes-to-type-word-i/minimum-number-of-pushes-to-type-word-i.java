class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int c = 0;
        if(n<=8) return n;
        else if(n<=16) c =  8+(n-8)*2;
        else if(n<=24) c = 24+(n-16)*3;
        else c = 48+(n-24)*4;

        return c; 
    }
}