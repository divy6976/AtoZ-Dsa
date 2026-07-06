class Solution {
    public int maxProduct(int[] nums) {

        int lefty=1;
      int  righty=1;
        int left=Integer.MIN_VALUE;
        int right=Integer.MIN_VALUE;


        int i=0;
        int j=nums.length-1;

        while(i<nums.length && j >=0){
            lefty=lefty * nums[i];
            
            left=Math.max(left,lefty);

            if(lefty == 0){
                lefty=1;
            }

            righty =righty * nums[j];
            right = Math.max(right,righty);
            if(righty == 0){
                righty =1;
            }
            i++;
            j--;

        }

        return Math.max(left,right);

        
        
    }
}