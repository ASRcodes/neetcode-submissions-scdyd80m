class Solution {
    public int maxProfit(int[] prices) {
        int bestprice = prices[0];
        int bestprofit = 0;
        for(int i =1;i<prices.length;i++){
            int profit = prices[i]-bestprice;
            if(prices[i]<bestprice) bestprice = prices[i];
            bestprofit = Math.max(bestprofit,profit);
        }
        return bestprofit;
    }
}
