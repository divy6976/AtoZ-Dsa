class Solution {
    public boolean canJump(int[] nums) {
   if(nums.length == 1){
    return true;
   }
   if(nums[0] == 0){
    return false;
   }
   int maxi=0;
   for(int i=0;i<nums.length-1;i++){
    if(i > maxi){
        return false;
    }
   maxi=Math.max(maxi,i+nums[i]);
   
    if(maxi >=nums.length-1){
        return true;
    }
   }
   return false;
 
    }
}