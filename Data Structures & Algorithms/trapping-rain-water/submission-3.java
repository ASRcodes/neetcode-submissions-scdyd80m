class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxleft = new int[n];
        maxleft[0] = height[0];
        int max = height[0];
        for(int i=1;i<n;i++){
            max = Math.max(max,height[i]);
            maxleft[i] = max;
        }
        int[] maxright = new int[n];
        maxright[n-1] = height[n-1];
        max = height[n-1];
        for(int i=n-2;i>=0;i--){
            max = Math.max(max,height[i]);
            maxright[i] = max;
        }

        int water = 0;
        for(int i=0;i<n;i++){
            water = water + Math.min(maxleft[i],maxright[i])-height[i];
        }
        return water;
    }
}
