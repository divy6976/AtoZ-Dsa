class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return 1;
        }

        Arrays.sort(nums);
        int cnt=1;
        int maxi=1;
        
        for(int i=1;i<nums.length;i++){

            if(i> 0 && nums[i]== nums[i-1]){
                continue;
            }

            
            if((nums[i] - nums[i-1]) >1){
                maxi=Math.max(maxi,cnt);
                cnt =1;
            }else {
                cnt++;
                maxi=Math.max(maxi,cnt);
            }

        }
        return maxi;
    }
}