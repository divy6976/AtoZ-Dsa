class Solution {
    public int maxProduct(int[] nums) {

        if(nums.length ==1){
            return nums[0];
        }

        int left =1;
        int maxileft=Integer.MIN_VALUE;

        int right =1;
        int maxiright=Integer.MIN_VALUE;

      int i=0;
      int j=nums.length-1;

      while(i< nums.length && j>=0){
        left =left * nums[i];

        maxileft=Math.max(left,maxileft);
        if(left == 0){
            left =1;
        }

        right =right * nums[j];
        maxiright=Math.max(right,maxiright);

        if(right == 0){
            right =1;
        }

        i++;
        j--;
        
        

      }
      return Math.max(maxileft,maxiright);



        
    }
}