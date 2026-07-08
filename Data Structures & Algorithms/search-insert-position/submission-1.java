class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(nums[mid] < target) {
                l = mid + 1;
            }
            else {
                if(mid == 0 || (mid - 1 >= 0 && nums[mid - 1] < target)) {
                    return mid;
                }
                r = mid - 1;
            }
        }
        return nums.length;
    }
}