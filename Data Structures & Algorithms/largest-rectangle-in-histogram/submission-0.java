class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxarea = 0;

        for(int i=0;i<=heights.length;i++){
            int currHeight = (i==heights.length)?0: heights[i];

            while(!st.isEmpty() && currHeight < heights[st.peek()]){

                int idx = st.pop();
                int height = heights[idx];
                int width;

                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i-st.peek()-1;
                }
                int area = height * width;
                maxarea = Math.max(area,maxarea);
            }
            st.push(i);
        }
        return maxarea;
    }
}
