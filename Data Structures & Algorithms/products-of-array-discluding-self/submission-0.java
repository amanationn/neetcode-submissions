class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0, product = 1;
        int n = nums.length;
        for(int num: nums) {
            if(num == 0)
                zero++;
            product *= num;
        }

        int[] ans = new int[n];
        if(zero > 1) {
            return ans;
        }
        if(zero == 1) {
            int zero_index = -1;
            product = 1;
            for(int i=0; i<n; ++i) {
                if(nums[i] == 0) {
                    zero_index = i;
                    continue;
                }
                product *= nums[i];
            }
            ans[zero_index] = product;
            return ans;
        }

        for(int i=0; i<n; ++i) {
            ans[i] = product / nums[i];
        }
        return ans;
    }
}  
