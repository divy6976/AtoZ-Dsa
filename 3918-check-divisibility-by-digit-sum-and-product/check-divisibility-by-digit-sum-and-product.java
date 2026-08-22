class Solution {
    public boolean checkDivisibility(int n) {
        int prd=1;
        int sum=0;
        int temp=n;
        while(n>0){
            int digit=n%10;
            sum += digit;
            prd=prd* digit;
            n=n/10;
        }
        if(temp % (sum + prd) == 0){
            return true;
        }
        return false;
    }
}