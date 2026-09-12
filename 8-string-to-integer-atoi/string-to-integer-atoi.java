class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int st = 0;
        boolean isneg = false;
        while (st < s.length() && s.charAt(st) == ' ') {
            st++;
        }

        // Check sign
        if (st < s.length() && s.charAt(st) == '-') {
            isneg = true;
            st++;
        } 
        else if (st < s.length() && s.charAt(st) == '+') {
            st++;
        }
        for(int i=st;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >='0' && ch <= '9'){
                int digit = ch-'0';
                if (ans > (Integer.MAX_VALUE - digit) / 10) {
                    if (isneg) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
                ans = ans*10+(ch-'0');
            }
            else{
                break;
            }
        }

        if(isneg){
            return -ans;
        }
        return ans;

    }
}