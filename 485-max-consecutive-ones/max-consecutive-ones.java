class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int sum=0;
        int cnt=0;


        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
              
                cnt =0;
            }else{
                cnt ++;
                sum =Math.max(sum,cnt) ;
            }
           
        }
       
        return sum;
        
    }
}