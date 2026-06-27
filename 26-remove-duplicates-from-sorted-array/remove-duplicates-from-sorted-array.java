class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length==1){
            return 1;
        }

        int cnt=0;

        int i=-1;
        int j=0;

        HashSet<Integer> st=new HashSet<>();

        while(j< nums.length){
            if(!st.contains(nums[j])){
                st.add(nums[j]);
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i=i+1;
            }
            j++;

        }
        return i-0+1;
    }
}