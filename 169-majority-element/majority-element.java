class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> mpp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);

        }
        int ans=0;

        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            if(entry.getValue() > nums.length/2){
                ans=entry.getKey();
            }
        }
        return ans;
        
    }
}