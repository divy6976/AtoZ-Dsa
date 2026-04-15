class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
   
              HashSet<Integer> st=new HashSet<>();

        for(int i=0;i<nums.length;i++){
           st.add(nums[i]);
        }

        int[] check=new int[st.size()];
      int j=0;
      for(int s:st){
        check[j++]=s;

      }
      Arrays.sort(check);


        int maxi=1;

        int cnt =1;

        for(int i=1;i<check.length;i++){
            int prev=check[i-1]+1;



            if(check[i] != prev){
                maxi=Math.max(cnt,maxi);
                cnt=1;

            }else {
            cnt ++;
        }
        }
        maxi=Math.max(maxi,cnt);
        
  return maxi;

        
    }
}