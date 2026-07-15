class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, area = 0;
        while(l < r) {
            int cur_area = Math.min(heights[l], heights[r]) * (r - l);
            area = Math.max(area, cur_area);
            if(heights[l] < heights[r])
                l += 1;
            else r -= 1;
        }
        return area;
    }
}
