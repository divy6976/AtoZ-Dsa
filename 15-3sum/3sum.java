class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        //x+y+z=0;
        //y+z=-x;

        for(int i=0;i<nums.length-2;i++){
   
   if(i > 0 && nums[i] == nums[i-1]){
    continue;
}
            int check=nums[i];
            check=-nums[i];

            int j=i+1;
            int k= nums.length-1;

            while(j<k){
                if(nums[j] + nums[k] == check){
                    ArrayList<Integer> sublist=new ArrayList<>();
      sublist.add(nums[i]);
      sublist.add(nums[j]);
      sublist.add(nums[k]);
      ans.add(new ArrayList<>(sublist));
      j++;
      k--;

      while(j<k && nums[j] == nums[j-1]){
        j++;
      }
       while(j<k && nums[k] == nums[k+1]){
        k--;
      }


                }else if(nums[j] + nums[k] > check){
                    k--;

                }else {
                    j++;
                }
            }


        }
        return ans;
        
    }
}