class Solution {
    public int findDuplicate(int[] nums) {
        //Floyd’s Fast & Slow Pointer
        int slow = 0, fast = 0;
        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast)
                break;
        }
        slow = 0; //set any one to beg and traverse again to get to the repeated num
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
