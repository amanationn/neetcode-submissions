class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        for(int i=m-1; i>=0; --i) {
            nums1[k] = nums1[i];
            k -= 1;
        }
        k = 0;
        int l = n, r = 0; 
        while(l < m+n && r < n) {
            if(nums1[l] <= nums2[r]) {
                nums1[k] = nums1[l];
                l += 1;
            }
            else {
                nums1[k] = nums2[r];
                r += 1;
            }
            k += 1;
        }
        while(r < n) {
            nums1[k] = nums2[r];
            r += 1;
            k += 1;
        }
    }
}