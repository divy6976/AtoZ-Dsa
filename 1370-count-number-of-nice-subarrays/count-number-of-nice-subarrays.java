class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
   return numof(nums,k)-numof(nums,k-1);
    }


    public int numof(int[] nums,int k){
         int l=0;
    int r=0;
    int sum=0;
    int cnt=0;
    while(r<nums.length){
        sum +=nums[r]%2;
        while(sum >k){
            sum=sum-nums[l]%2;
            l=l+1;
            
        }
        cnt=cnt + r-l+1;
        r=r+1;
   
}
 return cnt;
    }
}