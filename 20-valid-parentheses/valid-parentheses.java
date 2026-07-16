class Solution {
    public boolean isValid(String s) {

        if(s.charAt(0) == ']' || s.charAt(0) == '}' || s.charAt(0)==')'){
            return false;
        }
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '(' || ch=='[' || ch == '{'){
                st.push(ch);
            }else if(ch==')' || ch==']' || ch=='}'){
                if(st.isEmpty()){
                    return false;
                }
                 char dh=st.pop();
                if(ch==']'){
                    if(dh != '['){
                        return false;
                    }
                   
                   
                }else if(ch == '}'){
                   if(dh!='{'){
                    return false;
                   }
                }else {
                    if(dh !='('){
                        return false;
                    }
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
        
    }
}