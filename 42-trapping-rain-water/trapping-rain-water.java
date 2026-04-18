class Solution {

    void rightmaxi(int[] height, int[] rightmax){
        int n = height.length;
        int maxi = height[n - 1];

        rightmax[n - 1] = maxi;

        for(int i = n - 2; i >= 0; i--){
            if(height[i] > maxi){
                maxi = height[i];
            }
            rightmax[i] = maxi;
        }
    }

    void leftmaxi(int[] height, int[] leftmax){
        int n = height.length;
        int maxi = height[0];

        leftmax[0] = maxi;

        for(int i = 1; i < n; i++){
            if(height[i] > maxi){
                maxi = height[i];
            }
            leftmax[i] = maxi;
        }
    }

    public int trap(int[] height) {

        int n = height.length;
      

        int[] rightmax = new int[n];
        int[] leftmax = new int[n];

        rightmaxi(height, rightmax);
        leftmaxi(height, leftmax);

        int sum = 0;

        for(int i = 1; i < n - 1; i++){
            sum += Math.min(leftmax[i], rightmax[i]) - height[i];
        }

        return sum;
    }
}