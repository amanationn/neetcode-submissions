class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0, elm1 = 0;
        int count2 = 0, elm2 = 0;

        for(int i=0; i<n; ++i) {
            if(count1 == 0) {
                elm1 = nums[i];
                count1++;
            }
            else if(nums[i] == elm1) {
                count1++;
            }
            else if(count2 == 0) {
                elm2 = nums[i];
                count2++;
            }
            else if(nums[i] == elm2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if(isMajority(nums, elm1))
            ans.add(elm1);
        if(isMajority(nums, elm2))
            ans.add(elm2);

        return ans;
    }

    private boolean isMajority(int[] nums, int k) {
        int n = nums.length, count = 0;
        for(int num: nums) {
            if(num == k)
                count++;
        }
        return count > (n / 3);
    }
}