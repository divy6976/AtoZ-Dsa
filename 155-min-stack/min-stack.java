class MinStack {

    class Pair{
        int num;
        int mini;
        Pair(int num,int mini){
            this.num=num;
            this.mini=mini;
        }
    }
Stack<Pair> st=new Stack<>();
    public MinStack() {
        
    }
    int mini=Integer.MAX_VALUE;
    public void push(int val) {
        if(val < mini){
            mini=val;
        }
        st.push(new Pair(val,mini));
    }
    
    public void pop() {
        st.pop();

          if (!st.isEmpty()) {
        mini = st.peek().mini;
    } else {
        mini = Integer.MAX_VALUE;
    }
        
    }
    
    public int top() {
         Pair p=st.peek();
        return p.num;
    }
    
    public int getMin() {
        Pair p=st.peek();
        return p.mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */