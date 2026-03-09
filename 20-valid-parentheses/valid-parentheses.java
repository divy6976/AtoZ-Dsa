class Solution {
    public boolean isValid(String s) {

        char ch=s.charAt(0);

        if(ch== ')' || ch == '}' || ch==']'){
            return false;
        }
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char dh=s.charAt(i);
            if(st.isEmpty() ){
                if(dh== ')' || dh=='}' || dh==']'){
                    return false;
                }
            }

            
            if(dh == '(' || dh=='{' || dh== '['){
                st.push(dh);
            }else if(dh== ')' || dh=='}' || dh==']'){
                if(!st.isEmpty()){
                    if((st.peek() =='(' && dh==')') || (st.peek()=='{' && dh=='}') || (st.peek()=='[' && dh==']')){
                        st.pop();
                    }else {
                        return false;
                    }
                }
            }



        }
        if(st.isEmpty()){
            return true;
        }
        return false;


        
    }
}