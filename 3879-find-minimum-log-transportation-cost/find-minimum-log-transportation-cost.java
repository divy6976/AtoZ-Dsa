class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long cost=0;
        if(n>k){
            long x=n-k;
            cost+= x*k;
        }
        if(m>k){
            long y=m-k;
            cost+=y*k;

        }
return cost;

    }
}