class Solution {
    public void nextPermutation(int[] nums) {


        // step 1   
    // find pivot  a[i] < a[i+1];

   int j=nums.length-2;
   int pivot=-1;

   while(j>=0){
    if(nums[j] <nums[j+1]){

        pivot=j;

        break;
    }
    j--;

   }

   if(pivot == -1){
    int i=0;
    int k=nums.length-1;
   while(i<k){
    int temp=nums[i];
    nums[i]=nums[k];
    nums[k]=temp;
    i++;k--;
   }
   return;
   }
// step2 find rightmost bigger
int maxiind=-1;

   for(int i=nums.length-1;i>=pivot;i--){

    if(nums[i] > nums[pivot]){
        maxiind=i;
        break;
    }

   }

   int tempo=nums[pivot];
   nums[pivot]=nums[maxiind];
   nums[maxiind]=tempo;

   int left = pivot + 1;
int right = nums.length - 1;

while (left < right) {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
    left++;
    right--;
}

   
        
    }
}