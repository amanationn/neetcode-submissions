class Solution {
    public int strStr(String haystack, String needle) {
        //KMP-Algorithm - https://www.youtube.com/watch?v=M9azY7YyMqI
        int n = haystack.length(), m = needle.length();

        if(n < m)
            return -1;
        if(m == 0)
            return 0;
        if(m == n)
            return haystack.equals(needle) ? 0 : -1;

        int[] LPS = new int[m]; //longest-prefix-suffix
        LPS[0] = 0;
        int lps = 0, i = 1;
        while(i < m) {
            if(needle.charAt(i) == needle.charAt(lps)) {
                lps++;
                LPS[i] = lps;
                i++;
            }
            else {
                if(lps == 0) {
                    LPS[i] = 0;
                    i++;
                }
                else lps = LPS[lps - 1];
            }
        }

        lps = 0;
        i = 0;
        while(i < n && lps < m) {
            if(haystack.charAt(i) == needle.charAt(lps)) {
                i++;
                lps++;
            }
            else {
                if(lps == 0)
                    i++;
                else lps = LPS[lps - 1];
            }
        }

        return lps == m ? (i - m) : -1;
    }
}