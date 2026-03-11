class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> mpp=new HashMap<>();
        HashMap<Character,Character> mpps=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char dh=t.charAt(i);
            if(!mpp.containsKey(ch)){
                mpp.put(ch,dh);
            }else {
                if(mpp.get(ch) != dh){
                    return false;
                }
            }
        }
        for(int i=0;i<t.length();i++){
            char dh=t.charAt(i);
            char ch=s.charAt(i);
            if(!mpps.containsKey(dh)){
                mpps.put(dh,ch);
            }else {
                if(mpps.get(dh)!=ch){
                    return false;
                }
            }
        }
        return true;
        
    }
}