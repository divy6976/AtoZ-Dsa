class Solution {
    void subset(int[] nums,List<List<Integer>> ans,List<Integer> sublist,int j){
        if(sublist.size() > nums.length){
            return ;
        }
        ans.add(new ArrayList<>(sublist));
        for(int i=j;i<nums.length;i++){
  sublist.add(nums[i]);
  subset(nums,ans,sublist,i+1);
  sublist.remove(sublist.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();

      List<Integer> sublist=new ArrayList<>();

        subset(nums,ans,sublist,0);
return ans;
        
    }
}