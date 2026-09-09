class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] s1 = new int[123];
        int[] t1 = new int[123];

        for(int i=0;i<s.length();i++){
            char chs = s.charAt(i);
            s1[(int)chs]++;
            char cht = t.charAt(i);
            t1[(int)cht]++;
        }

        for(int i=97;i<=122;i++){
            if(s1[i] != t1[i]){
                return false;
            }
        }

        // for(int i=97;i<=122;i++){
        //     System.out.print(s1[i]);
        //     System.out.println(t1[i]);
        // }
        return true;
    }
}