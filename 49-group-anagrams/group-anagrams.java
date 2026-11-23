class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            String os = word;
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }

            map.get(s).add(os);
        }
        
        for(List<String> group : map.values()){
            list.add(group);
        }

        return list;
    }
}