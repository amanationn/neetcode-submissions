class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1, l = m - 1, r = n - 1; 
        while(l >= 0 && r >= 0) {
            if(nums1[l] >= nums2[r]) {
                nums1[k] = nums1[l];
                l -= 1;
            }
            else {
                nums1[k] = nums2[r];
                r -= 1;
            }
            k -= 1;
        }
        while(r >= 0) {
            nums1[k] = nums2[r];
            r -= 1;
            k -= 1;
        }
    }
}