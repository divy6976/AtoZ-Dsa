class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length ==1){
            return strs[0];
        }

      Arrays.sort(strs, (a, b) -> a.length() - b.length());

        if(strs[0].length() == 0){
            return "";
        }



         int maxi=Integer.MAX_VALUE;

        

         
            for(int j=1;j<strs.length;j++){
                String s=strs[j];
                int cnt=0;
                for(int k=0;k<strs[0].length();k++){
                    if((strs[0].charAt(k)) == (s.charAt(k))){
                        cnt ++;
                    }else {
                        break;
                    }
                }
                if(cnt==0){
                    return "";
                }else {
                    maxi=Math.min(maxi,cnt);
                }
            }
            return strs[0].substring(0,maxi);
         
    }
}