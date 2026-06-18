class Solution {
    public boolean check(int[] nums) {

//         int mini=Integer.MAX_VALUE;

//         int index=-1;

//         for(int i=0;i<nums.length;i++){
//             if(nums[i] < mini){
//                 mini=nums[i];
//                 index=i;
//             }

//         }
// ArrayList<Integer> ans=new ArrayList<>();
//         for(int i=index;i<nums.length;i++){
            
//            ans.add(nums[i]);
//         }

//         for(int i=0;i<index;i++){
//             ans.add(nums[i]);
//         }

//         for(int i=1;i<ans.size();i++){
//             if(ans.get(i-1)> ans.get(i)){
//                 return false;
//             }
//         }
//         return true;

int cnt=0;


   for(int i=0;i<nums.length;i++){
    if(i == nums.length-1){
        if(nums[nums.length-1] > nums[0]){
            cnt ++;
        }
        continue;
    }
    if(nums[i] > nums[i+1]){
        cnt ++;
    }
   }

   if(cnt > 1){
    return false;
   }

   return true;

        

        

    }
}