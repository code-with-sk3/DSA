class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
 
        System.out.println(sb);
        while(true){
            int si = sb.indexOf(part);
            if(si != -1){
                sb.delete(si,si+part.length());
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}