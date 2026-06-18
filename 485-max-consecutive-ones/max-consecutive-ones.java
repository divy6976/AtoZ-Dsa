class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxi=Integer.MIN_VALUE;
        int cnt=0;


        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                maxi=Math.max(maxi,cnt);
                cnt =0;
            }else{
                cnt ++;
            }
           
        }
        maxi=Math.max(maxi,cnt);
        return maxi;
        
    }
}