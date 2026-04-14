class Solution {
    public boolean isAnagram(String s, String t) {

        char[] str=s.toCharArray();
        char[] ttr=t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(ttr);

        if(str.length != ttr.length){
            return false;
        }
        for(int i=0;i<str.length;i++){
            if(str[i] != ttr[i]){
                return false;
            }
        }
      return true;
    }
}