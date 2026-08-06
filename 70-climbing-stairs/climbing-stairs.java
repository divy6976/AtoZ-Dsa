class Solution {
    public int climbStairs(int n) {

        int a=1;
        int b=2;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
    int ans=0;

      for(int i=3;i<=n;i++){
        int c=a+b;
        ans=c;
        a=b;
        b=c;
      }
return ans;
        
    }
}