class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0, elm1 = Integer.MAX_VALUE;
        int count2 = 0, elm2 = Integer.MIN_VALUE;

        for(int num:nums) {
            if(num == elm1) {
                count1++;
            }
            else if(num == elm2) {
                count2++;
            }
            else if(count1 == 0) {
                elm1 = num;
                count1++;
            }
            else if(count2 == 0) {
                elm2 = num;
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
        if(elm1 != elm2 && isMajority(nums, elm2))
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