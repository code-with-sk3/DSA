class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] words = s.trim().split("\\s+");
        int n = words.length;
        for(int i=n-1;i>=0;i--){
            String str = words[i];
            ans = ans+str;
            ans = ans+" ";
        }
        ans = ans.substring(0,ans.length()-1);
        return ans;
    }
}