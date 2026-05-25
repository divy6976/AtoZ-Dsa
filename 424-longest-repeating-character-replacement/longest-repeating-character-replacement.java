class Solution {
    public int characterReplacement(String s, int k) {


        HashMap<Character,Integer> mpp=new HashMap<>();

        int maxifreq=0;
        int length=0;
        int ans=0;

        int l=0;
        int r=0;

        while(r< s.length()){
            char ch=s.charAt(r);

            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
             maxifreq=Math.max(maxifreq,mpp.get(ch));

            length= r-l+1;

            while(length - maxifreq > k){
                char dh=s.charAt(l);
                mpp.put(dh,mpp.getOrDefault(dh,0)-1);



                l++;
                length=r-l+1;

            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
        
    }
}