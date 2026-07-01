class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length, l = 0, r = n-1;
        while(l < r) {
            while(l < n && nums[l] != val) {
                l += 1;
            }
            while(r >= 0 && nums[r] == val) {
                r -= 1;
            }
            if(l < r) {
                nums[l] = nums[r];
                nums[r] = val;
            }
        }
        while(n > 0 && nums[n-1] == val)
            n -= 1;
        return n;
    }
}