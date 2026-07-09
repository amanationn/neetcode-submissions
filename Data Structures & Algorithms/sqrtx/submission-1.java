class Solution {
    public int mySqrt(int x) {
        int l = 1, r = x / 2;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            //using x = product / x, format to avoid overflow
            if(mid <= x / mid && (mid+1) > x / (mid+1))
                return mid;
            else if (mid < x / mid) {
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return x; //case 0, 1
    }
}