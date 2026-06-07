class Solution {

    

    int check(int n,int[] dp){


        if(n<=1){
            return 1;

        }
        if(dp[n] !=-1){
            return dp[n];
        }



        dp[n]=check(n-1,dp) +check(n-2,dp);

        return dp[n];
        
    }


    public int climbStairs(int n) {


        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);



       
        return  check(n,dp);
        
        
    }
}