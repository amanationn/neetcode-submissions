class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = -1;
        for(int i=0; i<n; ++i) {
            if(nums[i] == 0) {
                if(k == -1)
                    k = i+1;
                while(k < n && nums[k] == 0)
                    k += 1;
                if(k == n)
                    break;
                nums[i] = nums[k];
                nums[k] = 0;
            }
        }
    }
}