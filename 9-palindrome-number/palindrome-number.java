class Solution {
    public boolean isPalindrome(int x) {
        

        String str=String.valueOf(x);
        int i=0;
        int j=str.length()-1;

        while(i<j){
            char ch=str.charAt(i);
            char dh=str.charAt(j);
            if(ch!=dh){
                return false;
            }
            i++;
            j--;
        }
return true;

        
    }
}