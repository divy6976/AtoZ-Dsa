class Solution {
    public int missingNumber(int[] nums) {

        HashSet<Integer> st=new HashSet<>();

        int maxi=0;

        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }

        for(int i=0;i<=maxi+1;i++){

            if(!st.contains(i)){
                return i;
            }

        }
        return -1;
        
    }
}