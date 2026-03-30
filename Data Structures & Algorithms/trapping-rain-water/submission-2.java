class Solution {
    public int trap(int[] height) {
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];

        int max = 0;
        for(int i =0;i<height.length;i++){
            max = Math.max(max,height[i]);
            leftmax[i]=max;
        }
        max = 0;
        for(int i =height.length-1;i>=0;i--){
            max = Math.max(max,height[i]);
            rightmax[i]=max;
        }
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            trappedwater = trappedwater + Math.min(rightmax[i],leftmax[i])-height[i];
        }
        return trappedwater;
    }
}
