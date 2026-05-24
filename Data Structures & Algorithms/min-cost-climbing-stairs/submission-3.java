class Solution {
    public static int helper(int[] a,int i,int[] dp){
        int n = a.length;
        if(i>=n) return 0;

        if(dp[i] != -1) return dp[i];

        return dp[i] = a[i]+Math.min(
            helper(a,i+1,dp),
            helper(a,i+2,dp)
        );
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+2];
        Arrays.fill(dp,-1);

        return Math.min(
            helper(cost,0,dp),
            helper(cost,1,dp)
        );
    }
}
