class Solution {

    int robs(int[] nums){
      
   
        int[] dp=new int[nums.length+2];
           dp[nums.length] = 0;

       
       for(int i=nums.length-1;i>=0;i--){

       int pick = nums[i] +dp[i+2];




        int notpick=dp[i+1];


         dp[i]=Math.max(pick,notpick);

       }
       return dp[0];




    }


    public int rob(int[] nums) {
       


    return    robs(nums);

       
    }
}