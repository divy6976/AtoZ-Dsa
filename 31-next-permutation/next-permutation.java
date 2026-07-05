class Solution {
    public void nextPermutation(int[] nums) {



        int pivot=-1;

       for(int i=nums.length-1;i>0;i--){
         if(nums[i-1] < nums[i]){
            pivot=i-1;
            break;
         }
       }


       if(pivot == -1 ){

        int i=0;
        int j=nums.length-1;

        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        return ;
    
       }

        int small=-1;
       int mini=Integer.MAX_VALUE;

       for(int i=nums.length-1;i>pivot;i--){
    if(nums[i] > nums[pivot]){
        small = i;
        break;
    }
       }

       int temp=nums[pivot];
       nums[pivot]=nums[small];
       nums[small]=temp;

       int m= pivot+1;
       int n=nums.length-1;

       while(m<n){
        int temps = nums[m];
        nums[m]=nums[n];
        nums[n]=temps;
        m++;
        n--;
       }

       return;


   
        
    }
}