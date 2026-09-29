class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = nums[0];
        for(int i=1; i<n; ++i) {
            ans[i] = nums[i] * ans[i-1]; //store leftProduct in ans
        }

        int rightProduct = 1;
        for(int i=n-1; i>0; --i) {
            ans[i] = ans[i-1] * rightProduct;
            rightProduct *= nums[i]; //calculate rightProduct on the go
        }
        ans[0] = rightProduct;

        return ans;
    }
}  
