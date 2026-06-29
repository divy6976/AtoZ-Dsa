class Solution {

    void permutation(int[] nums,List<List<Integer>> ans,ArrayList<Integer> sublist){
        if(sublist.size()== nums.length){
            ans.add(new ArrayList<>(sublist));
            return ;
        }

      

        for(int i=0;i<nums.length;i++){
            if(!sublist.contains(nums[i])){
                sublist.add(nums[i]);
                permutation(nums,ans,sublist);    
                 sublist.remove(sublist.size()-1);            
            }
   
         
        }
    }



    public List<List<Integer>> permute(int[] nums) {


        
        List<List<Integer>> ans=new ArrayList<>();

        ArrayList<Integer> sublist=new ArrayList<>();

        permutation(nums,ans,sublist);


       return ans;
        
    }
}