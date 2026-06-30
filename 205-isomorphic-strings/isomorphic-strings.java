class Solution {
    public boolean isIsomorphic(String s, String t) {


        HashMap<Character,Character> mpp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char dh=t.charAt(i);
            if(!mpp.containsKey(ch)){
                mpp.put(ch,dh);
            }else {
                if(mpp.get(ch) !=dh){
                    return false;
                }
            }
        }
        HashMap<Character,Character> mpps=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            char dh=s.charAt(i);
            if(!mpps.containsKey(ch)){
                mpps.put(ch,dh);
            }else {
                if(mpps.get(ch) !=dh){
                    return false;
                }
            }
        }
        return  true;
        
    }
}