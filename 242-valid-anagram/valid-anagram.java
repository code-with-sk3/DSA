class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String str = new String(ch);

        char[] chr = t.toCharArray();
        Arrays.sort(chr);
        String st = new String(chr);
        if(str.equals(st)) return true;

        return false;
    }
}