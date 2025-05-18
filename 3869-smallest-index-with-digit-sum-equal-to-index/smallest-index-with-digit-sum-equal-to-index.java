class Solution {
    public int smallestIndex(int[] nums) {
        int mini=Integer.MAX_VALUE;
       
        for(int i=0;i<nums.length;i++){
            int total=0;
           while(nums[i]>0){
            int digit=nums[i]%10;
            total +=digit;
            nums[i]=nums[i]/10;
           }
           if(total==i){
            mini=Math.min(mini,i);
           }
        }
return (mini == Integer.MAX_VALUE) ? -1 : mini;
    }
}