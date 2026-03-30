class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int n : piles){
            high = Math.max(high,n);
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;

            int hours = 0;
            for(int pile : piles){
                hours += (pile+mid-1)/mid;
            }

            if(hours <= h){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
