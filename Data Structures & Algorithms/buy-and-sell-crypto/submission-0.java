class Solution {
    public int maxProfit(int[] prices) {
        int maxprice=0;
        int price = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                
                price = prices[j]-prices[i];
                maxprice = Math.max(price,maxprice);
            }
        }
        return maxprice;   
    }
}
