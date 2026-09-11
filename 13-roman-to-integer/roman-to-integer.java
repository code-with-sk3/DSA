class Solution {
    public int romanToInt(String s) {
        int[] val =  {1000,500,100,50,10,5,1};
        char[] sym = {'M','D','C','L','X','V','I'};
        char precch = s.charAt(0);
        int prevval = 0;
        for(int i=0;i<7;i++){
            if(sym[i]==precch){
                prevval = val[i];
                break;
            }
        }
        int ans = prevval;
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            int currval = 0;
            for(int j=0;j<7;j++){
                if(sym[j]==(ch)){
                    currval = val[j];
                }
            }
            if(currval > prevval){
                ans = ans+currval-(2*prevval);
            }
            else{
                ans = ans+currval;
            }
            precch = ch;
            prevval = currval;
        }
        return ans;
    }
}