class Solution {
    void check(List<List<Integer>> ans,ArrayList<Integer> sublist,int k,int n,int ind,int sum){

        if(sublist.size() == k){
            if(sum == n){
                ans.add(new ArrayList<>(sublist));
            }
            return ;
        }

        
        for(int i=ind ;i<=9;i++){


            sum += i;
            sublist.add(i);
            check(ans,sublist,k,n,i+1,sum);
            sum -=i;
            sublist.remove(sublist.size()-1);




        }



    }
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans=new ArrayList<>();

        ArrayList<Integer> sublist=new ArrayList<>();

        check(ans,sublist,k,n,1,0);
        return ans;
    }
}