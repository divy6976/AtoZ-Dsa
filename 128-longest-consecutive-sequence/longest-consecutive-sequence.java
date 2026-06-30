class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        if(nums.length ==1 ){
            return 1;
        }


   int maxi=0;

   HashSet<Integer> st=new HashSet<>();
    ArrayList<Integer> ans=new ArrayList<>();
  

   for(int i=0;i<nums.length;i++){
    st.add(nums[i]);
   }
  for(int s:st){
    ans.add(s);
  }
 Collections.sort(ans);
  


int cnt=1;
   for(int i=1;i<ans.size();i++){
    int compare=ans.get(i)-1;

    if(ans.get(i-1) ==  compare){
        cnt ++;
    }else {
        cnt=1;
    }
    maxi=Math.max(maxi,cnt);


   }

   maxi=Math.max(maxi,cnt);

   return maxi;

       
        
    }
}