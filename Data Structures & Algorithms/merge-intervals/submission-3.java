class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if(a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        List<int[]> ans = new ArrayList<>();
        int x = intervals[0][0], y = intervals[0][1];

        for(int i=1; i<intervals.length; ++i) {
            if(y < intervals[i][0]) {
                ans.add(new int[]{x, y});
                x = intervals[i][0];
                y = intervals[i][1];
            }
            else {
                y = Math.max(y, intervals[i][1]);
            }
        }
        ans.add(new int[]{x, y});
        return ans.toArray(new int[ans.size()][]); //can use ans[0][] also, java will allocate the correct size automatically.
    }
}
