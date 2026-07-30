class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0, i = 0, j = 0, m = g.length, n = s.length;
        while(i < m && j < n) {
            if(g[i] <= s[j]) {
                count++;
                i++;
                j++;
            }
            else j++;
        }
        return count;
    }
}