class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int m = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            if(ch==')'){
                m = Math.max(m,st.size());
                st.pop();
            }
        }
        return m;
    }
}