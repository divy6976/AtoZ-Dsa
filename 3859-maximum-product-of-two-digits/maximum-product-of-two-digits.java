class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        while(n>0){
            int digit=n%10;
            ans.add(digit);
            n=n/10;

        }
         for(int i=0;i<ans.size();i++){
            for(int j=i+1;j<ans.size();j++){
                int multi=ans.get(i)*ans.get(j);
maxi=Math.max(maxi,multi);
            }
         }
        return maxi;
    }
}