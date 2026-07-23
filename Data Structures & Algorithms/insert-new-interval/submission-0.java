class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length, x = newInterval[0], y = newInterval[1];
        if(n == 0) {
            return new int[][]{newInterval};
        }

        if(y < intervals[0][0])
            ans.add(newInterval);

        for(int i=0; i<n; ++i) {
            if(intervals[i][1] < x) {
                ans.add(intervals[i]);
            }
            else if(intervals[i][0] > y) {
                if(i > 0 && intervals[i-1][1] < x)
                    ans.add(newInterval);
                ans.add(intervals[i]);
            }
            else {
                int j = i;
                while(j+1 < n && intervals[j+1][0] <= y)
                    j += 1;
                ans.add(new int[]{Math.min(x, intervals[i][0]), Math.max(y, intervals[j][1])});
                i = j;
            }
        }

        if(intervals[n-1][1] < x)
            ans.add(newInterval);

        return ans.toArray(new int[ans.size()][]);
    }
}
