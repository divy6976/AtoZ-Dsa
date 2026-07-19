class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1){
            return (long) s;
        }


            long k=n/2;

            return (long) s+(k*m)-(k-1);


   
    }
}