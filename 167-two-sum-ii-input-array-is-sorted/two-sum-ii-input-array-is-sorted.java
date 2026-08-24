class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer,Integer> mpp=new HashMap<>();

          mpp.put(numbers[0],0);
          int[] ans=new int[2];

          for(int i=1;i<numbers.length;i++){
            int check=target-numbers[i];
            if(mpp.containsKey(check)){
                ans[0]=mpp.get(check)+1;
                ans[1]=i+1;
                break;
            }
            mpp.put(numbers[i],i);

          }
          return ans;


    }
}