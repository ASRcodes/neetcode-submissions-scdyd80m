class Solution {
    public int maxArea(int[] heights) {
        int maxarea = Integer.MIN_VALUE;
        int i=0,j=heights.length-1;
        while(i<j){
            int width = j-i;
            int height = Math.min(heights[i],heights[j]);
            int area = width*height;
            maxarea = Math.max(area,maxarea); 
            if(heights[i]<heights[j]) i++;
            else j--;
        }
        return maxarea;
    }
}
