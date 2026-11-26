class Solution {
    public boolean canAliceWin(int n) {
        int ans = 0;
        if(n<10) return false;
        int n1 = 10;
        while(n>=n1){
            n = n-n1;
            ans++;
            n1--;
        }

        if(ans%2==0){
            return false;
        }

        return true;
    }
}