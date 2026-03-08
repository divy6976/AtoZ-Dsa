class Solution {
    public boolean isPalindrome(String s) {
        String t=s.toLowerCase();


    ArrayList<Character> ans=new ArrayList<>();

    for(int i=0;i<s.length();i++){
        char ch=t.charAt(i);
        if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
            ans.add(ch);
        }

    }

    int i=0;
    int j=ans.size()-1;

    while(i<j){
        char ch=ans.get(i);
        char dh=ans.get(j);
        if(ch!=dh){
            return false;
        }
        i++;
        j--;

    }

    return true;



        
    }
}