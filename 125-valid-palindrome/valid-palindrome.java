class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();

  StringBuilder sb=new StringBuilder();
  for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(ch >='a' && ch<='z' || ch>='0' && ch<='9'){
        sb.append(ch);
    }

  }
  String check=sb.toString();
  int i=0;
  int j=check.length()-1;
  while(i<j){
    char ch=check.charAt(i);
    char dh=check.charAt(j);
    if(ch!=dh){
        return false;
    }
    i++;
    j--;

  }
  return true;

    }
}