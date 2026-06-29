class Solution {
    public int maxProduct(int[] nums) {
        

        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int prd=1;
            for(int j=i;j<nums.length;j++){
                prd=prd * nums[j];

                maxi=Math.max(prd,maxi);

            }
        }
        return maxi;
    }
}