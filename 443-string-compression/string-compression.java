class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        char prevchar = chars[0];
        int freq = 1;
        for(int i=1;i<chars.length;i++){
            char currch = chars[i];
            if(currch == prevchar){
                freq++;
            }
            else{
                sb.append(prevchar);
                if(freq > 1){
                    sb.append(freq);
                }

                prevchar = chars[i];
                freq  = 1;
            }
        }

        sb.append(prevchar);
        if(freq>1){
            sb.append(freq);
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
} 