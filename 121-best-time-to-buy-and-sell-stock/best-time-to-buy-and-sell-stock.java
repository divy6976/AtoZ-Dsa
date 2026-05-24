class Solution {
    public int maxProfit(int[] prices) {

        int buy=Integer.MAX_VALUE;
        int maxi=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < buy){
                buy=prices[i];
            }else {
                maxi=Math.max(maxi,prices[i] - buy);
            }
        }
        return maxi;
    }
}