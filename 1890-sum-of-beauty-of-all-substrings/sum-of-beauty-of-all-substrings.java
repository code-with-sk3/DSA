class Solution {
    public int beautySum(String s) {
        if(s.length()==0) return 0;
        int[] freq = new int[123];
        int ans = 0;
        if(s.length() <= 2) return 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str = s.substring(i,j+1);

                int mfe = 0;
                int lfe = Integer.MAX_VALUE;

                for(int k=0;k<str.length();k++){
                    char ch = str.charAt(k);
                    freq[(int)ch]++;
                }

                for(int l=0;l<123;l++){
                    if(freq[l]>mfe){
                        mfe = freq[l];
                    }
                    if(freq[l]<lfe && freq[l]!=0){
                        lfe = freq[l];
                    }
                }
                if(mfe != lfe){
                    ans = ans+(mfe-lfe);
                }

                for(int m=0;m<123;m++){
                    if(freq[m]!=0){
                        freq[m]=0;
                    }
                }
            }
        }
        return ans;
    }
}