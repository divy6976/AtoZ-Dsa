class Solution {
    void generate(List<String> ans,int target,StringBuilder sb){
        if(sb.length() == target){
            ans.add(sb.toString());
            return ;
        }
       
       sb.append('(');
        generate(ans,target,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        generate(ans,target,sb);
        sb.deleteCharAt(sb.length()-1);


    }
    boolean check(String s) {
    Stack<Character> st = new Stack<>();

    for (char ch : s.toCharArray()) {
        if (ch == '(') {
            st.push(ch);
        } else {
            if (st.isEmpty()) {
                return false;
            }
            st.pop();
        }
    }

    return st.isEmpty();
}
    public List<String> generateParenthesis(int n) {
        
        List<String> ans=new ArrayList<>();

        StringBuilder sb=new StringBuilder();

int target=2*n;
        generate(ans,target,sb);
        List<String> result=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            if(check(ans.get(i))){
                result.add(ans.get(i));
            }
        }
        return result;
    }
}