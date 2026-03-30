class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
               int b = st.pop();
               int a = st.pop();
               int ans = 0;
               switch(s){
                    case "+": ans = a+b;
                    break;
                    case "*": ans = a*b;
                    break;
                    case "/": ans = a/b;
                    break;
                    case "-": ans = a-b;
                    break;
                }
                st.push(ans);     
            }else{
                int num = Integer.parseInt(s);
                st.push(num);
            }
        }
        return st.pop();
    }
}
