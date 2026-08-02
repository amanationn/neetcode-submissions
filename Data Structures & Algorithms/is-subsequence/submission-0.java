class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), i = 0, n = t.length(), j = 0;
        while(i < m && j < n) {
            char ch = s.charAt(i);
            while(j < n && t.charAt(j) != ch) {
                j++;
            }
            i++;
            j++;
        }
        if(i < m || j > n)
            return false;
        return true;
    }
}