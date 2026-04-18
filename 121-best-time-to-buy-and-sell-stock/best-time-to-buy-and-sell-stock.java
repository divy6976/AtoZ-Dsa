class Solution {
    public int maxProfit(int[] prices) {

       int sum=0;
       int bought=prices[0];

       for(int i=1;i<prices.length;i++){
        if(prices[i] < bought){
            bought=prices[i];
        }else {
        sum=Math.max(sum,prices[i]-bought);
        }
       }
       return sum;

        
    }
}