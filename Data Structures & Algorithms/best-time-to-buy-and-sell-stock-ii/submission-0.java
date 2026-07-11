class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0, n = prices.length;
        for(int i=1; i<n; ++i) {
            if(prices[i] < prices[i-1]) {
                profit += prices[i-1] - buy;
                buy = prices[i];
            }
        }
        if(prices[n - 1] > buy)
            profit += prices[n-1] - buy;
        return profit;
    }
}