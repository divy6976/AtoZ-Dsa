class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0){
            return 0;
        }

        int l=0;
        int r=0;
        int maxi=1;

        HashMap<Character,Integer>mpp=new HashMap<>();


        while(r<s.length()){

            while(mpp.containsKey(s.charAt(r))){
                mpp.put(s.charAt(l),mpp.getOrDefault(s.charAt(l),0)-1);
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