class Solution {
    public int removeDuplicates(int[] nums) {
       
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
                ans.add(nums[i]);
            }
        }
        for(int i=0;i<ans.size();i++){
            nums[i]=ans.get(i);
        }
        return ans.size();
    }
}