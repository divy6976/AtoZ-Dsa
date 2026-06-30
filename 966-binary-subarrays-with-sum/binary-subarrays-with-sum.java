class Solution {

    int check(int[] nums,int goal){
        if(goal < 0){
    return 0;
}
        int sum =0; 
        int i=0;
        int j=0;
        int cnt=0;

        while(j<nums.length){
            sum += nums[j];
            while(sum > goal){
                sum -=nums[i];
                i++;
            }
            cnt += j-i+1;
            j++;
        }
        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return check(nums,goal)-check(nums,goal-1);
    }
}