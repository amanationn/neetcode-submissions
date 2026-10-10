class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int ans = Integer.MAX_VALUE;
        for(int i=k-1; i<n; ++i) {
            ans = Math.min(ans, nums[i] - nums[i - k + 1]);
        }

        return ans;
    }
}