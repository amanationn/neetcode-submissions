class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        int ctr = 0;
        for(int i=n-k; i<n; ++i) {
            temp[ctr] = nums[i];
            ctr += 1;
        }
        ctr = n-1;
        for(int i=n-k-1; i>=0; --i) {
            nums[ctr] = nums[i];
            ctr -= 1;
        }
        for(int i=0; i<temp.length; ++i) {
            nums[i] = temp[i];
        }
    }
}