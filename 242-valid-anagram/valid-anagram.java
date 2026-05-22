class Solution {
    public boolean isAnagram(String s, String t) {


        char []st=s.toCharArray();
        char []tt=t.toCharArray();

        Arrays.sort(st);
        Arrays.sort(tt);
        if(st.length != tt.length){
            return false;
        }


       for(int i=0;i< st.length;i++){
        if(st[i] != tt[i]){
            return false;
        }
       }
    return true;

        
        
    }
}