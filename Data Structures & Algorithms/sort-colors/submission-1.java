class Solution {

    //Dutch National Flag algorithm.
    //[0 ... left-1]      -> 0s
    //[left ... mid-1]    -> 1s
    //[mid ... right]     -> Unknown
    //[right+1 ... n-1]   -> 2s

    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;
        
        while(mid <= right) {
            if(nums[mid] == 1)
                mid += 1;
            else if(nums[mid] == 0) {
                swap(nums, left, mid);
                left += 1;
                mid += 1;
            }
            else {
                swap(nums, mid, right);
                right -= 1;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}