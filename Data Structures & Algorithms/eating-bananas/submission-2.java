class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int high = 0;
        for(int n : piles){
            high = Math.max(n,high);
        }
        int ans = high;

        while(min<=high){
            int mid = min + (high-min)/2;
            
            int hour = 0;
            for(int n : piles){
                hour += (n+mid-1)/mid;
            }

            if(hour<=h){
                high = mid-1;
                ans = mid;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }
}
