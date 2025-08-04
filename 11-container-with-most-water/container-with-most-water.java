class Solution {
    public int maxArea(int[] nums) {

        int ans=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            ans=Math.max(ans,(j-i)*Math.min(nums[i],nums[j]));
            if(nums[i]<nums[j]){
                i++;
            }else if(nums[i]==nums[j]) {
i++;
j--;
            }else {
                j--;
            }
        }
        return ans;
    }
}