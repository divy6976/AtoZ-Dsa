class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        int l=0;
        int r=nums.length-1;
       while(l<r){
            if(nums[l]+nums[r]> target){
                r--;
            }else if(nums[l]+nums[r]<target){
                l++;
            }else{
                result[0]=l+1;
                result[1]=r+1;
                break;
            }
        }
        return result;
    }
}