class Solution {
    public boolean isPowerOfTwo(int n) {

        ArrayList<Integer> ans=new ArrayList<>();

        
        while(n>1){
            if(n%2==1){
                ans.add(1);
            }
            n=n/2;

        }

        if(n==1){
            ans.add(1);
        }



 if(ans.size()==1){
    return true;
 }
 return false;

       

       
    }
}