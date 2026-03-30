class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            profit = prices[i]-minprice;
            maxprofit = Math.max(maxprofit,profit);
            if(prices[i]<minprice) minprice = prices[i];
        }
        return maxprofit;
    }
}
