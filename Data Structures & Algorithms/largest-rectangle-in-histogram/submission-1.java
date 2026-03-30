class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxarea = 0;
        for(int i=0;i<=n;i++){
            int currHt = (i==n)?0:heights[i];

            while(!st.isEmpty() && currHt < heights[st.peek()]){
                int idx = st.pop();
                int ht = heights[idx];
                int width;

                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i-st.peek()-1;
                }

                int area = ht*width;
                maxarea = Math.max(maxarea,area);
            }
            st.push(i);
        }
        return maxarea;
    }
}
