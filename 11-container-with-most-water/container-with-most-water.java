class Solution {
    public int maxArea(int[] height) {

        int maxi=0;

        int i=0;
        int j=height.length-1;

        while(i<j){
            int len=Math.abs(j-i);
            int mini=Math.min(height[i],height[j]);
            maxi=Math.max(maxi, len* mini);
            if(height[i] <=height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxi;
    }
}