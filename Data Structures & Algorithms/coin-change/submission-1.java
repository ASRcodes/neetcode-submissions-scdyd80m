class Solution {
    public int helper(int[] a,int n,int[] dp){
        if(n==0) return 0;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(n-a[i]>=0){
                int subans = 0;
                if(dp[n-a[i]] != -1){
                    subans = dp[n-a[i]];
                }else{
                    subans = helper(a,n-a[i],dp);
                }
                if(subans!=Integer.MAX_VALUE) ans = Math.min(subans+1,ans);
            }
        }
        return dp[n]=ans;
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;

        int ans = helper(coins,amount,dp);

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
