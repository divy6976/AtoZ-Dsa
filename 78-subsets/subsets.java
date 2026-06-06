class Solution {
    void check(int i,List<List<Integer>> ans,int[] nums,ArrayList<Integer> sublist){

        if(i >=nums.length){
            ans.add(new ArrayList<>(sublist));
            return ;
        }

        sublist.add(nums[i]);  // pick
        check(i+1,ans,nums,sublist);
        sublist.remove(sublist.size() - 1);
        check(i+1,ans,nums,sublist);



    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();

        ArrayList<Integer> sublist=new ArrayList<>();


        check(0,ans,nums,sublist);
        return ans;
        
    }
}