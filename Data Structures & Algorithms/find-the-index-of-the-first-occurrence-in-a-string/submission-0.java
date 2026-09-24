class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        int k = 0;
        while(k <= n-m) {
            int i = k, j = 0;
            while(i < n && j < m && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if(j == m) {
                return k;
            }
            k++;
        }
        return -1;
    }
}