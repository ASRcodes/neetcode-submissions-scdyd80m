class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int maxarea =0;
        while(i<j){
            int width = j-i;
            int h = Math.min(heights[i],heights[j]);
            int area = width*h;
            maxarea = Math.max(area,maxarea);
            if(heights[i]<heights[j]) i++;
            else j--;
        }
        return maxarea;
    }
}
