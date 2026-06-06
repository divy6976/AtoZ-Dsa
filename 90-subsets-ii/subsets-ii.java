class Solution {
       void recurse(int [] nums,  ArrayList<Integer> sublist,  HashSet<ArrayList<Integer>> mpp,int i){
        if(i==nums.length){
            mpp.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[i]);
        recurse(nums,sublist,mpp,i+1);
        sublist.remove(sublist.size()-1);
        recurse(nums,sublist,mpp,i+1);

    }



    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> sublist=new ArrayList<>();
  

  HashSet<ArrayList<Integer>> mpp=new HashSet<>();

  recurse(nums,sublist,mpp,0);

for(ArrayList list:mpp){
    ans.add(new ArrayList<>(list));
}

return ans;

        
        
    }
}