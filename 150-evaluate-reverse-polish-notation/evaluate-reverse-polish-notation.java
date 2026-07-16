class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("*") &&
                !tokens[i].equals("/")) {

                st.push(Integer.parseInt(tokens[i]));

            } else {

                int second = st.pop();   // top element
                int first = st.pop();    // second top element

                int sum = 0;

                if (tokens[i].equals("+")) {
                    sum = first + second;
                } else if (tokens[i].equals("-")) {
                    sum = first - second;
                } else if (tokens[i].equals("*")) {
                    sum = first * second;
                } else {
                    sum = first / second;
                }

                st.push(sum);
            }
        }

        return st.pop();
    }
}