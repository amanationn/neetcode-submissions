class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void mergeSort(int[] nums, int l, int r) {
        if(l < r) {
            int mid = (l + r) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }
    }
    public void merge(int[] nums, int l, int mid, int r) {
        //temp-array to avoid modifying og arr
        int[] temp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;
        while(i <= mid && j <= r) {
            if(nums[i] <= nums[j])
                temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }
        //add-remaining-values
        while(i <= mid) {
            temp[k++] = nums[i++];
        }
        while(j <= r) {
            temp[k++] = nums[j++];
        }
        //copy-phase to main arr
        for(i = l; i <= r; ++i) {
            nums[i] = temp[i - l];
        }
    }
}