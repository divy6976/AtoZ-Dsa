class Solution {
    public void rotate(int[] nums, int k) {

        int shift=k%nums.length;

        int[] ans =new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i]=nums[(i-shift+nums.length) % nums.length];

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        return;
    }
}
