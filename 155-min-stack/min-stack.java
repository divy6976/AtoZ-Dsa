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
  
    public void push(int val) {
      if(st.isEmpty()) {
        st.push(new Pair(val, val));
    } else {
        int min = Math.min(val, st.peek().mini);
        st.push(new Pair(val, min));
    }
    }
    
    public void pop() {
        st.pop();

     
        
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