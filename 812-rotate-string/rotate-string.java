class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n;i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));

            if(sb.toString().equals(goal)){
                return true;
            }
        }

        return false;
    }
}