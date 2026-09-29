class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // int[] leftProduct = new int[n];
        // int[] rightProduct = new int[n];
        int[] ans = new int[n];

        ans[0] = nums[0];
        for(int i=1; i<n; ++i) {
            ans[i] = nums[i] * ans[i-1]; //leftProduct
        }

        // rightProduct[n-1] = nums[n-1];
        int rightProduct = 1;
        for(int i=n-1; i>0; --i) {
            // rightProduct[i] = nums[i] * rightProduct[i+1];
            ans[i] = ans[i-1] * rightProduct;
            rightProduct *= nums[i];
        }
        ans[0] = rightProduct;

        // ans[0] = rightProduct[1];
        // ans[n-1] = leftProduct[n-2];
        // for(int i=1; i<n-1; ++i) {
        //     ans[i] = leftProduct[i-1] * rightProduct[i+1];
        // }

        return ans;
    }
}  
