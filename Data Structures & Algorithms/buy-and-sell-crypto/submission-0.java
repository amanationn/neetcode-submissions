class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0, n = prices.length;
        for(int i=1; i<n; ++i) {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);

        }
        return profit;
    }
}
