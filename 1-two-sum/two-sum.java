class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ans=new int[2];
Arrays.fill(ans,-1);
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int check=target-nums[i];
            if(mpp.containsKey(check)){
                ans[0]=mpp.get(check);
                ans[1]=i;
                break;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
}
