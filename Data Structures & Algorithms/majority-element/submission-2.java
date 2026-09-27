class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority_element = nums[0];
        int count = 1;

        for(int i=1; i<n; ++i) {
            if(nums[i] == majority_element) {
                count++;
            }
            else {
                count--;
                if(count == 0) {
                    majority_element = nums[i];
                    count = 1;
                }
            }
        }
        return majority_element;
    }
}