class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1, i = n-1;
        int[] ans = new int[n];

        while(l <= r) {
            int pl = nums[l] * nums[l];
            int pr = nums[r] * nums[r];
            
            if(pr > pl) {
                ans[i] = pr;
                r--;
            }
            else {
                ans[i] = pl;
                l++;
            }
            i--;
        }

        return ans;
    }
}