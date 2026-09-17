class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] ans = new int[nums1.length];
        int k = 0;

        for(int x: nums1) {
            int i = 0;
            while(i < n && nums2[i] != x) {
                i++;
            }
            while(i < n && nums2[i] <= x) {
                i++;
            }
            
            ans[k] = (i >= n) ? -1 : nums2[i];
            k++;
        }
        return ans;
    }
}