class Solution {
    // x= -(y+z)
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<ArrayList<Integer>> st=new HashSet<>();

        for(int i=0;i<nums.length-2;i++){

            int y=i+1;
            int z=nums.length-1;

            while(y<z){
                int target=-(nums[i]);
                int check= (nums[y]+nums[z]);

                if(check == target){
                    ArrayList<Integer> sublist=new ArrayList<>();
                    sublist.add(nums[i]);
                    sublist.add(nums[y]);
                    sublist.add(nums[z]);
                    Collections.sort(sublist);
                    st.add(sublist);
                    y++;
                    z--;
                    
                    
                }else if(check  > target){
                    z--;
                }else {
                    y++;
                }
            }
                     

        }

         for(ArrayList sublist:st){
                ans.add(sublist);
            }
            return ans;
    }
}