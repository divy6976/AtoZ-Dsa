class Solution {


    void check(int ind,List<List<Integer>> ans,ArrayList<Integer> sublist,int[] candidates,int target,int sum){

        if(ind >= candidates.length){
            if(sum == target){
                ans.add(new ArrayList<>(sublist));
            }
            return ;
        }

        if(sum == target){
            ans.add(new ArrayList<>(sublist));
            return ;
        }

        if(sum > target){
            return ;
        }

        sum += candidates[ind];
        sublist.add(candidates[ind]);
        check(ind,ans,sublist,candidates,target,sum);
        sublist.remove(sublist.size()-1);
        sum -=candidates[ind];

        check(ind+1,ans,sublist,candidates,target,sum);


    }




    public List<List<Integer>> combinationSum(int[] candidates, int target) {


        List<List<Integer>> ans=new ArrayList<>();

        ArrayList<Integer> sublist=new ArrayList<>();


        check(0,ans,sublist,candidates,target,0);

        return ans;
        
    }
}