class Solution {
    public boolean detectCapitalUse(String word) {

        int cnt =0;
        int less=0;

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

            if(((ch -'A')+'A') >=65 && ((ch -'A')+'A' <=90)){
                cnt ++;
            }else {
                less++;

            }

        }
        if(cnt == 1 ){
            char ch=word.charAt(0);
            if((ch-'A')+'A' >=65 && (ch-'A')+'A' <=90){
                return true;
            }
            
        }else if(cnt== word.length()){
            return true;
        }else if(less == word.length()){
            return true;
        }
        return false;
        
    }
}