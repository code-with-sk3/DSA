class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        String lw = words[words.length-1];

        return lw.length();
    }
}