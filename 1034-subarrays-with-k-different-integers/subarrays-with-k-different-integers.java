class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
          return lessthan(nums,k)-lessthan(nums,k-1);
    }

public int lessthan(int[] nums,int k ){
   
    int l=0;
    int r=0;
 HashMap<Integer,Integer> mpp=new HashMap<>();

    int cnt=0;
    while(r<nums.length){
       mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
        while(mpp.size()>k){
           mpp.put(nums[l],mpp.get(nums[l])-1);
          if(mpp.get(nums[l])==0){
            mpp.remove(nums[l]);
          }
            l=l+1;
        }
        cnt=cnt + r-l+1;
        r=r+1;
   
}
 return cnt;
     
}
    
}