class Solution {
    public int maxArea(int[] h) {
        int maxA = Integer.MIN_VALUE;
        int i =0;
        int j =h.length-1;

        while(i<j){
            int min = Math.min(h[i],h[j]);
            int wid = (j-i);
            int area = min*wid;
            maxA = Math.max(maxA,area);

            if(h[i]>h[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxA;
    }
}
