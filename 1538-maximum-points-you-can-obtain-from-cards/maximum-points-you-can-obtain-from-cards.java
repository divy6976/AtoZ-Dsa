class Solution {
    public int maxScore(int[] cardPoints, int k) {




        int maxi=0;
        int sum =0;


        for(int i=0;i<k;i++){
            sum += cardPoints[i];
           
        }
        int j=k-1;
        if(k==cardPoints.length){
            return sum;
        }
        maxi=Math.max(sum,maxi);

        int m=cardPoints.length-1;

        while(j>=0){
            sum -=cardPoints[j];
            sum += cardPoints[m];

            maxi=Math.max(maxi,sum);
            j--;
            m--;
        }

        
        return maxi;
        
    }
}