class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
            int n = landStartTime.length;
    int m = waterStartTime.length;
    int sum = Integer.MAX_VALUE;
    
    for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                int ls=landStartTime[i];
    int ld=landDuration[i];
    int ws=waterStartTime[j];
    int wd=waterDuration[j];
                //land ride;
                //water ride
   if(ls +ld<=ws){
    sum=Math.min(sum,ws+wd);

   }else{
    sum=Math.min(sum,ls+ld+wd);
   }

   if(ws+wd<=ls){
    sum=Math.min(sum,ls+ld);
   }else{
    sum=Math.min(sum,ws+wd+ld);
   }
            
        }
    }

    return sum;
}
}