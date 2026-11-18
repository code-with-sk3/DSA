class Solution {
    public int minChanges(String s) {
        int count = 0;
        if(s.length()%2 != 0) return 0;
        for(int i=0;i<s.length();i=i+2){
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
            }
        }

        return count;
    }
}