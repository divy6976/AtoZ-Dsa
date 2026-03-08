class Solution {
    public int removeDuplicates(int[] nums) {

        HashMap<Integer,Integer> mpp=new HashMap<>();
   int j=0;
       for(int i=0;i<nums.length;i++){

        if(!mpp.containsKey(nums[i])){
            mpp.put(nums[i],i);
            nums[j]=nums[i];
            j++;
        }
       }
        return mpp.size();
    }
}