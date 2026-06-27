class Solution {
    public void rev(char[] s, int l, int r) {
        if(r <= l)
            return;
        char ch = s[l];
        s[l] = s[r];
        s[r] = ch;
        rev(s, l+1, r-1);
    }
    public void reverseString(char[] s) {
        rev(s, 0, s.length - 1);
    }
}