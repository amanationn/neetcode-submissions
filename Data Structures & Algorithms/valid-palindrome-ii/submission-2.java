class Solution {
    boolean checkPalindrome(String s, int l, int r) {
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length(), l = 0, r = n-1;
        while(l < r) {
            if(s.charAt(l) == s.charAt(r)) {
                l += 1;
                r -= 1;
            }
            else {
                return checkPalindrome(s, l+1, r) || checkPalindrome(s, l, r-1);
            }
        }
        return true;
    }
}