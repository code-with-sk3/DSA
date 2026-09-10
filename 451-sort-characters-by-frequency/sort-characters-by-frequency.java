class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        while(!map.isEmpty()){
            int mfreq = 0;
            char mch = ' ';

            for(char ch : map.keySet()){
                int fr = map.get(ch);
                if(fr > mfreq){
                    mfreq = fr;
                    mch = ch;
                }
            }
            for(int i=1;i<=mfreq;i++){
                sb.append(mch);
            }
            mfreq = 0;
            map.remove(mch);
        }

        return sb.toString();
    }
}