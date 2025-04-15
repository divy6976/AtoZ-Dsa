class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mpp.put(s.charAt(i),i);
            if(mpp.size()==3){
                cnt=cnt+1+Collections.min(mpp.values());
            }
        } 
        return cnt;
    }
}