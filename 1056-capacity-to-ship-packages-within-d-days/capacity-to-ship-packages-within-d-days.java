class Solution {
    int possible(int mid,int[] weights){
        int cnt=0;
        int count=1;
        for(int i=0;i<weights.length;i++){
        
           
        if(cnt + weights[i] > mid){
            count++;           // need a new day
            cnt = weights[i];  // start new day with current weight
        } else {
            cnt += weights[i];
        }
    }
    return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        int wt=0;
        for(int i=0;i<weights.length;i++){
            high +=weights[i];
            low=Math.max(low,weights[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;

  
if(possible(mid,weights)<=days){
    wt=mid;
    high=mid-1;
}else{
    low=mid+1;
}
        }
      return wt;
        
    }
}