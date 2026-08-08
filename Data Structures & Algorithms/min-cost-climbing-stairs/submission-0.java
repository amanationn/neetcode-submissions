class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] min_cost = new int[n];
        min_cost[0] = cost[0];
        min_cost[1] = cost[1];
        for(int i=2; i<n; ++i) {
            min_cost[i] = cost[i] + Math.min(min_cost[i-1], min_cost[i-2]);
        }
        return Math.min(min_cost[n-1], min_cost[n-2]);
    }
}
