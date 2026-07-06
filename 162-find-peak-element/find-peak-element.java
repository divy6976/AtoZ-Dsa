class Solution {
    public int findPeakElement(int[] nums) {

        if(nums.length == 1){
            return 0;
        }

        int ans=-1;

        for(int i=0;i<nums.length;i++){
            if(i==0 && nums.length >1){
                if(nums[i] > nums[i+1]){
                    ans=i;
                    break;
                }
            }else if(i== nums.length -1 && nums.length >1){
                if(nums[i] > nums[i-1]){
                    ans = i;
                    break;


                }
            }else if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                ans =i;
                break;
            }
        }

        return ans;
        
    }
}