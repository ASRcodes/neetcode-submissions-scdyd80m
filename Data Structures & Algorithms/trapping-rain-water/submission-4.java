class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int max = height[0];
        for(int i=0;i<n;i++){
            max = Math.max(max,height[i]);
            leftMax[i] = max;
        }

        int[] rightMax = new int[n];
        int maxx = height[n-1];
        for(int i=n-1;i>=0;i--){
            maxx = Math.max(maxx,height[i]);
            rightMax[i]=maxx;
        }

        int maxArea = 0;
          int area = 0;
        for(int i=0;i<n;i++){
          
            area += Math.min(rightMax[i],leftMax[i]) - height[i];
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
