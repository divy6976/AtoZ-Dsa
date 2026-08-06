class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
    
       boolean flag=false;
       for(int i=0;i<nums.length;i++){
        if(nums[i] < 0){
            flag = true;
        }
       }

       if(!flag){
        int largest=nums[nums.length-1];
        int second=nums[nums.length-2];
        int third=nums[nums.length-3];
        long prd= largest * second * third;

        return (int) prd;
       }

       flag=false;

       for(int i=0;i<nums.length;i++){
        if(nums[i] >=0){
            flag= true;
        }
       }
       if(!flag){
        int first= nums[nums.length-1];
        int second= nums[nums.length-2];
        int third=nums[nums.length-3];
        long prd=first * second * third;
        return (int) prd;
       }


       long sum1 = nums[0] * nums[1] * nums[nums.length-1];
       long sum2= nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];


      if(sum1 > sum2 ){
        return (int) sum1;
      }
  return (int) sum2;

    
        
    }
}