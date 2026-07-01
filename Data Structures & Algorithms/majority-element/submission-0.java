class Solution {
    public int majorityElement(int[] nums) {
        //Boyer-Moore Majority Vote Algorithm
        int count = 1, maj_elm = nums[0];
        for(int i=1; i<nums.length; ++i) {
            if(nums[i] == maj_elm)
                count += 1;
            else {
                count -= 1;
                if(count == 0) {
                    maj_elm = nums[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for(int elm: nums) {
            if(elm == maj_elm)
                count += 1;
        }
        return (count > nums.length/2) ? maj_elm : -1;
    }
}