class Solution {
    public void moveZeroes(int[] nums) {

       

        int i=-1;
        int j=0;

        while(j<nums.length){
            if(nums[j] !=0){
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i=i+1;
            }
            j++;
        }
        
        
    }
}