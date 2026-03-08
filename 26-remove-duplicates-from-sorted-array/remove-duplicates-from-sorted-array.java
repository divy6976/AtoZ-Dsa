class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> mpp=new HashSet<>();
   int j=0;
       for(int i=0;i<nums.length;i++){

        if(!mpp.contains(nums[i])){
            mpp.add(nums[i]);
            nums[j]=nums[i];
            j++;
        }
       }
        return mpp.size();
    }
}