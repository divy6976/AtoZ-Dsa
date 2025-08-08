class Solution {
    int possible(int mid,int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum += (int) Math.ceil((double) nums[i] / mid);

        }

        
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=0;
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(mid,nums)>threshold){
                low=mid+ 1;

            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}