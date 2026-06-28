class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans=new int[nums.length];

        ArrayList<Integer> posi=new ArrayList<>();
        ArrayList<Integer> negi=new ArrayList<>();


        for(int i=0;i<nums.length;i++){
            if(nums[i] <0){
                negi.add(nums[i]);
            }else {
                posi.add(nums[i]);
            }
        }

        int m=0;
        int n=0;

        for(int i=0;i<ans.length;i++){
            if(i%2==0){
             ans[i]=   posi.get(m);
                m++;
            }else {
               ans[i]= negi.get(n);
                n++;
            }
        }
        return ans;
        
    }
}