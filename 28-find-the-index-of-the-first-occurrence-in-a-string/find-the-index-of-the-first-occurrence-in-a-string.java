class Solution {
    public int strStr(String haystack, String needle) {
        //if(haystack.equals(needle)) return 0;
        int n = needle.length();
        for(int i=0;i<=haystack.length()-n;i++){
            if(needle.charAt(0) == haystack.charAt(i)){
                String str = haystack.substring(i,i+n);
                if(str.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}