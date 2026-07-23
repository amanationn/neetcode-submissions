class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length, x = newInterval[0], y = newInterval[1];
        if(n == 0) {
            return new int[][]{newInterval};
        }
        boolean inserted = false;

        for(int i=0; i<n; ++i) {
            if(intervals[i][1] < x) {
                ans.add(intervals[i]);
            }
            else if(intervals[i][0] > y) {
                if(!inserted) {
                    ans.add(new int[]{x, y});
                    inserted = true;
                }
                ans.add(intervals[i]);
            }
            else {
                x = Math.min(x, intervals[i][0]);
                y = Math.max(y, intervals[i][1]);
            }
        }
        if(!inserted)
            ans.add(new int[]{x, y});
        return ans.toArray(new int[ans.size()][]);
    }
}
