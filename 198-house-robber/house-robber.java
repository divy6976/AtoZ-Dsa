class Solution {

    int rob(int[] nums,int i,int[] dp){
        if(i>= nums.length){
            return 0;
        }

        if(dp[i] !=-1){
            return dp[i];
        }

       int pick = nums[i] + rob(nums, i + 2,dp);


        int notpick=rob(nums,i+1,dp);


        return dp[i]=Math.max(pick,notpick);




    }


    public int rob(int[] nums) {
        int[]dp=new int[nums.length];

        Arrays.fill(dp,-1);


    return    rob(nums,0,dp);

       
    }
}