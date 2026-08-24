class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l=0;
        int maxi=0;
        int r=0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            while(mpp.containsKey(ch)){
               mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
                if(mpp.get(s.charAt(l)) == 0){
                    mpp.remove(s.charAt(l));
                }
                l++;
            }
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
            
            maxi=Math.max(maxi,r-l+1);
            r++;

        }
        return maxi;

    }
}