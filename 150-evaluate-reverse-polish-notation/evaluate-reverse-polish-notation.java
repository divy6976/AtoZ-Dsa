class Solution {
    public int evalRPN(String[] tokens) {


        Stack<Integer> st=new Stack<>();

        for(int i=0;i<tokens.length;i++){
           String s=tokens[i];
           if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
   
         int b=st.pop();
         int a=st.pop();
        
          if(s.equals("+")){
            int sum =a+b;
            st.push(sum);
          }else if(s.equals("-")){
            int diff=a-b;
            st.push(diff);
          }else if(s.equals("*")){
            int multi=a*b;
            st.push(multi);
          }else {
            if(b!=0){
                st.push(a/b);
            }
          }

     
           }else {
            st.push(Integer.parseInt(s));
           }

        }
        return st.pop();
        
    }
}