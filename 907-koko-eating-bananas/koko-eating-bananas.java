class Solution {

long check(int[] piles,long mid){
        long cnt =0;

        for(int i=0;i<piles.length;i++){
            cnt +=(int) Math.ceil((double) piles[i] / (double) mid);
        }
        return cnt;
    }

    public int minEatingSpeed(int[] piles, int h) {

        long low=1;
        long high=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);

        }
        long ans=-1;

        while(low<=high){
            long mid=(low+high)/2;
          long num=check(piles,mid);
          if(num <= h){

            ans=mid;
            high=mid-1;

          }else {
            low=mid+1;
          }
        }
        return (int) ans;
        
    }
}