class Solution {
    public int hammingWeight(int n) {
        ArrayList<Integer> ans=new ArrayList<>();

        while(n>1){
            if(n%2==1){
                ans.add(n%2);


            }
            n=n/2;
        }
        if(n==1){
            ans.add(n);
        }
        return ans.size();
     
        
    }
}