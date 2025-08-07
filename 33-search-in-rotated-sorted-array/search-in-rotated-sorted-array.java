class Solution {
    public int search(int[] nums, int target) {
int less=-1;
int mini=-1;
     int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] < ans) {
                ans = nums[mid];
                mini=mid;
            }

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low=0;
         high=mini-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
less=mid;
            }

            if(nums[mid]>target){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
low=mini;
high=nums.length-1;

   while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
less=mid;
            }

            if(nums[mid]>target){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }


        return less;
        
    }
}