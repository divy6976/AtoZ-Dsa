class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    HashMap<Character,Integer> mpp=new HashMap<>();
    int l=0;
    int r=0;
    int length=0;
    int maxlen=0;
 while(r<s.length()){
    if(mpp.containsKey(s.charAt(r))){
        if(mpp.get(s.charAt(r))  >= l){
                   l = mpp.get(s.charAt(r)) + 1;
        }
    }
    mpp.put(s.charAt(r),r);
    length=r-l+1;
    maxlen=Math.max(maxlen,length);
    r++;

 }

    




return maxlen;


    }
}