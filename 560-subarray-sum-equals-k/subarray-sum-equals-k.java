class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();

        mpp.put(0,1);
        int sum=0;

        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int check=prefix[i]-k;
            if(mpp.containsKey(check)){
                sum+= mpp.get(check);
            }
            mpp.put(prefix[i],mpp.getOrDefault(prefix[i],0)+1);
        }
        return sum;
    }
}