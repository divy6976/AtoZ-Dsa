class Solution {

    void check(List<List<Integer>> ans,ArrayList<Integer> sublist,int[] nums,int i){
        if(i== nums.length){
            ans.add(new ArrayList<>(sublist));
            return ;
        }

        sublist.add(nums[i]);
        check(ans,sublist,nums,i+1);
        sublist.remove(sublist.size()-1);
        check(ans,sublist,nums,i+1);

    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();

        ArrayList<Integer> sublist=new ArrayList<>();

        check(ans,sublist,nums,0);

        return ans;
        
    }
}