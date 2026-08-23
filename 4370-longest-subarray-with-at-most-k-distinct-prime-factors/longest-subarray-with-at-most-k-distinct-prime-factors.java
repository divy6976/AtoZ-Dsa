class Solution {
    ArrayList factor(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
      ans.add(i);
             if(i!=n/i){
                ans.add(n/i);
             }
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            if(prime(ans.get(i))){
                result.add(ans.get(i));
            }
        }
        return result;
    }

    boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public int longestSubarray(int[] nums, int k) {
        int maxi=0;
        int l=0;
        int r=0;
HashMap<Integer,Integer> mpp=new HashMap<>();
        while(r<nums.length){
            int num=nums[r];
     ArrayList<Integer> sublist=factor(num);
   for(int i=0;i<sublist.size();i++){
                mpp.put(sublist.get(i),mpp.getOrDefault(sublist.get(i),0)+1);
            }

      while(mpp.size() > k){
        ArrayList<Integer> ch=factor(nums[l]);
        for(int i=0;i<ch.size();i++){
          mpp.put(ch.get(i),mpp.get(ch.get(i))-1);
          if(mpp.get(ch.get(i)) == 0){
            mpp.remove(ch.get(i));
          }
        }
        l++;
      }


         
   maxi=Math.max(maxi,r-l+1);
   r++;
      
        }
        
return maxi;
    }
}