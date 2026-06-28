class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]== nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;

            int target=-(nums[i]);

            while(j<k){
   if((nums[j] + nums[k]) == target){
List<Integer> sublist=new ArrayList<>();
sublist.add(nums[i]);
sublist.add(nums[j]);
sublist.add(nums[k]);

ans.add(new ArrayList<>(sublist));
j++;
k--;


// Skip duplicate j
while (j < k && nums[j] == nums[j - 1]) {
    j++;
}

// Skip duplicate k
while (j < k && nums[k] == nums[k + 1]) {
    k--;
}


   }   else if(nums[j] + nums[k] > target){
                   k--;
                }else {
                   j++;
                }

            }
        }
        return ans;
        
    }
}