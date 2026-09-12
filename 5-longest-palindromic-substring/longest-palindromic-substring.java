class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str = s.substring(i,j+1);
                if(ispalindrom(str)){
                    if(str.length() > ans.length()){
                        ans = str;
                    }
                }
            }
        }
        return ans;
    }
    public static boolean ispalindrom(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}