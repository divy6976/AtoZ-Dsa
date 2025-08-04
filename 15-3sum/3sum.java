class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
          
            if(i>0 &&nums[i]==nums[i-1]) continue;

            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else {
                      ArrayList<Integer> sublist=new ArrayList<>();
                    sublist.add(nums[i]);
                    sublist.add(nums[j]);
                    sublist.add(nums[k]);
                    result.add(sublist);
                    j++;
                    k--;
                                        // ✅ Skip duplicates
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;

                }
            }





                    }
return result;
    }
}