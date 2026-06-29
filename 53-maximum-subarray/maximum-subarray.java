class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length ==1 ){
            return nums[0];
        }
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(sum <0){
                maxi=Math.max(sum,maxi);
                sum=0;
            }else{
                maxi=Math.max(sum,maxi);
            } 

            
        }
        return maxi;
    }
}