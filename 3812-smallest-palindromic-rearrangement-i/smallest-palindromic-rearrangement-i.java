import java.util.Arrays;
class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        if(n%2 == 0){
            for(int i=0;i<n/2;i++){
                char ch = s.charAt(i);
                sb.append(ch);
            }
            char[] arr =  sb.toString().toCharArray();
            Arrays.sort(arr);
            sb = new StringBuilder(new String(arr));
            for(int i=(n/2)-1;i>=0;i--){
                char ch = sb.charAt(i);
                sb.append(ch);
            }
        }
        else{
            for(int i=0;i<n/2;i++){
                char ch = s.charAt(i);
                sb.append(ch);
            }
            char[] arr =  sb.toString().toCharArray();
            Arrays.sort(arr);
            sb = new StringBuilder(new String(arr));

            sb.append(s.charAt(n/2));

            for(int i=(n/2)-1;i>=0;i--){
                char ch = sb.charAt(i);
                sb.append(ch);
            }

        }
        return sb.toString();
    }
}