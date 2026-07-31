class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;
        while(l < r) {
            while(l < n && nums[l] % 2 == 0)
                l++;
            while(r >= 0 && nums[r] % 2 != 0)
                r--;
            if(l < r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
        return nums;
    }
}