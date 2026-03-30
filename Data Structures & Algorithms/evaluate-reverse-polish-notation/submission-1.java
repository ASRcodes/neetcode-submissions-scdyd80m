class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                int res = 0;

                switch(s){
                    case "+": res = a+b;
                    break;    
                    case "-": res = a-b;
                    break;                
                    case "*": res = a*b;
                    break;
                    case "/": res = a/b;
                    break;
                }
                st.push(res);
            }else{
                int c = Integer.parseInt(s);
                st.push(c);
            }
        }
        return st.pop();
    }
}
