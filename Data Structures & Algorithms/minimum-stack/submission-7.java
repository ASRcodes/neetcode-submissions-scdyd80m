class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    public MinStack() {
        minst = new Stack<>();
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || val<=minst.peek()){
            minst.push(val);
        }else{
            minst.push(minst.peek());
        }
    }
    
    public void pop() {
        st.pop();
        minst.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
