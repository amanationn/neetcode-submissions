class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMaxHeight = 0, rightMaxHeight = 0;
        int l = 0, r = n-1;
        int water_area = 0;
        while(l <= r) {
            leftMaxHeight = Math.max(leftMaxHeight, height[l]);
            rightMaxHeight = Math.max(rightMaxHeight, height[r]);
            if(leftMaxHeight <= rightMaxHeight) {
                water_area += leftMaxHeight - height[l];
                l += 1;
            }
            else {
                water_area += rightMaxHeight - height[r];
                r -= 1;
            }
        }
        return water_area;
    }
}
