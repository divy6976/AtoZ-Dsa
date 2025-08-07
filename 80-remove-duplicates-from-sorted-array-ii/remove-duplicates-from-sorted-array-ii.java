class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }

    int idx=0;
    nums[idx++]=nums[0];
    nums[idx++]=nums[1];
for(int i=2;i<nums.length;i++){
    if(nums[idx-2]!=nums[i]){
        nums[idx++]=nums[i];
    }
}
return idx;

        
    }
}