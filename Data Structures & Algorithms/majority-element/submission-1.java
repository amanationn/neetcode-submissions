class Solution {
    public int majorityElement(int[] nums) {
        //Boyer-Moore Majority Vote Algorithm
        int n = nums.length, count = 1, majority_element = nums[0];
        for(int i=1; i<n; ++i) {
            if(nums[i] == majority_element)
                count += 1;
            else {
                count -= 1;
                if(count == 0) {
                    majority_element = nums[i];
                    count = 1;
                } 
            }
        }
        return majority_element;
    }
}