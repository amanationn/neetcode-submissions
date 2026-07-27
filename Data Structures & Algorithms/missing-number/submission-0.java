class Solution {
    public int missingNumber(int[] nums) {
        int miss_num = 0;
        for(int i=0; i<nums.length; ++i) {
            miss_num ^= i + 1;
            miss_num ^= nums[i];
        }
        return miss_num;
    }
}
