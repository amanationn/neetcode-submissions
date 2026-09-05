class Solution {
    public int minimumRecolors(String blocks, int k) {
        int r = 0, ops = 0, n = blocks.length();
        while(r < k && r < n) {
            if(blocks.charAt(r) == 'W')
                ops++;
            r++;
        }
        int ans = ops;
        while(r < n) {
            if(blocks.charAt(r - k) == 'W')
                ops--;
            if(blocks.charAt(r) == 'W')
                ops++;
            r++;
            ans = Math.min(ops, ans);
        }
        return ans;
    }
}