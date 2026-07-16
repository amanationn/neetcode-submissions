class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMaxHeight = 0, rightMaxHeight = 0;
        int l = 0, r = n-1;
        int water_area = 0;
        while(l <= r) {
            if(leftMaxHeight <= rightMaxHeight) {
                leftMaxHeight = Math.max(leftMaxHeight, height[l]);
                water_area += leftMaxHeight - height[l];
                l += 1;
            }
            else {
                rightMaxHeight = Math.max(rightMaxHeight, height[r]);
                water_area += rightMaxHeight - height[r];
                r -= 1;
            }
        }
        return water_area;
    }
}
