class Solution {
    public int mySqrt(int x) {
        if(x <= 1)
            return x;
        int l = 1, r = x / 2, ans = 0;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            //using x = product / x, format to avoid overflow
            if(mid <= x / mid) {
                ans = mid; //probable ans, now look for the larger right
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return ans;
    }
}