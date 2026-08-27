class Solution {
    boolean check(int[] piles,int h,int mid){
        long cnt =0;
        for(int i=0;i<piles.length;i++){
            cnt += (long) Math.ceil((double) piles[i]/(double)mid);
        }
        return cnt<=h;

    }
    public int minEatingSpeed(int[] piles, int h) {

        int ans=Integer.MAX_VALUE;

        int high=Integer.MIN_VALUE;
        int low=1;
        
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(check(piles,h,mid)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
}