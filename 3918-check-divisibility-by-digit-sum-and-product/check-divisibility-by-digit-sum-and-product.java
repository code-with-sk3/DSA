class Solution {
    public boolean checkDivisibility(int n) {
        int n1 = n;
        int add = 0;
        while(n1>0){
            int digit = n1%10;
            add = add+digit;
            n1 = n1/10;
        }

        int product = 1;
        n1 = n;
        while(n1>0){
            int digit = n1%10;
            product = product*digit;
            n1 = n1/10;
        }

        int sum = add+product;

        if(n%sum==0){
            return true;
        }

        return false;
    }
}