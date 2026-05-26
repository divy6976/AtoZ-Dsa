class Solution {

    boolean check(int mid,int[] piles,int h){

        int cnt=0;

        for(int  i=0;i<piles.length;i++){
           cnt += Math.ceil((double)piles[i] / mid);
        }
        if(cnt >h){
            return false;
        }
        return true;

    }


    public int minEatingSpeed(int[] piles, int h) {
    

    int low=1;
    int high=0;
    int ans=0;

    for(int i=0;i<piles.length;i++){
        high=Math.max(piles[i],high);
    }

    while(low<=high){
        int mid=(low+high)/2;

        if(check(mid,piles,h)){
            ans=mid;
            high=mid-1;
        }else {
            low=mid+1;
        }

    }

    return ans;


        
    }
}