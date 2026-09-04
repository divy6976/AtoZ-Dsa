class Solution {
    public int maxProfit(int[] prices) {


        int profit=0;

        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < buy){
                buy=prices[i];
            }else{
             
             if(i<prices.length-1 && prices[i] >prices[i+1]){
                profit+= prices[i]- buy;
                buy=Integer.MAX_VALUE;
             }else if(i==prices.length-1){
                  profit+= prices[i]- buy;
                buy=Integer.MAX_VALUE;
             }
              
            }

        }
        return profit;

     

    }
}