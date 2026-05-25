class Solution {
    public boolean isValid(String s) {

        char ch=s.charAt(0);

        if(ch == '}' || ch==']' || ch==')'){
            return false;
        }

        Stack<Character > st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char dh=s.charAt(i);

            if(dh == '[' || dh=='{' || dh=='('){
                st.push(dh);
            }else if(dh == ']'){
                if(!st.isEmpty()){
                char po=st.pop();
                if(po == '{' || po == '('){
                    return false;

                }
                }else {
                    return false;
                }
            }else if(dh == '}'){
                if(!st.isEmpty()){
                char po=st.pop();

                if(po == '[' || po =='('){
                    return false;
                }
                }else{
                    return false;
                }
            }else if(dh ==')'){
                if(!st.isEmpty()){
                char po=st.pop();
                if(po == '{' || po == '['){
                    return false;
                }
                }else{
                    return false;
                }
            }

        }

        if(!st.isEmpty()){
            return false;
        }
        return true;
        
    }
}