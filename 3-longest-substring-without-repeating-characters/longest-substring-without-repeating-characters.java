class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0){
            return 0;
        }


        int l=0;
        int r=0;
        int length=1;

        HashMap<Character,Integer> mpp=new HashMap<>();

        while(r< s.length()){
            char ch=s.charAt(r);

            while(mpp.containsKey(ch)){

                 mpp.put(s.charAt(l) , mpp.getOrDefault(s.charAt(l),0)-1);

                 if(mpp.get(s.charAt(l)) == 0){
      mpp.remove(s.charAt(l));
                 }
                 l++;

                
            }
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            length=Math.max(length,r-l+1);
  r++;

        }
      return length;  
    }
}