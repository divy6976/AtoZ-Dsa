class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
int cnt=i-mpp.get(nums[i]);
if(cnt<=k){
    return true;
}
            }
            mpp.put(nums[i],i);
        }

return false;
    }
}