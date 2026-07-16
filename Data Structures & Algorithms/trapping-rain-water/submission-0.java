class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxHeightRight = new int[n];
        int[] maxHeightLeft = new int[n];
        maxHeightRight[0] = height[0];
        for(int i=1; i<n; ++i) {
            maxHeightRight[i] = Math.max(maxHeightRight[i-1], height[i]);
        }
        maxHeightLeft[n-1] = height[n-1];
        for(int i=n-2; i>=0; --i) {
            maxHeightLeft[i] = Math.max(maxHeightLeft[i+1], height[i]);
        }
        
        int water_area = 0;
        for(int i=0; i<n; ++i) {
            int mhl = maxHeightLeft[i], mhr = maxHeightRight[i];
            if(height[i] >= mhl || height[i] >= mhr)
                continue;
            else {
                water_area += Math.min(mhl, mhr) - height[i];
            }
        }
        return water_area;
    }
}
