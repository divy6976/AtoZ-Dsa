class Solution {

    void check(int ind,ArrayList<Integer>sublist,List<List<Integer>> ans,int[] candidates,int target){


        if(target == 0){
            ans.add(new ArrayList<>(sublist));
        }

        for(int i=ind;i<candidates.length;i++){
            if(i> ind && candidates[i]== candidates[i-1]){
                continue;
            } // duplicate 

            if(candidates[i] > target){
                return ;
            }

            sublist.add(candidates[i]);
            check(i+1,sublist,ans,candidates,target-candidates[i]);
            sublist.remove(sublist.size()-1);

        }



  





    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        Arrays.sort(candidates);

      

        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> sublist=new ArrayList<>();

        check(0,sublist,ans,candidates,target);

       
        return ans;
        
    }
}