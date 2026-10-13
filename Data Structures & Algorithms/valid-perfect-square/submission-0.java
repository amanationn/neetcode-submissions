class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) {
            return true;
        }
        int l = 1, r = num/2;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            long product = (long) mid * mid;
            if(product == num) {
                return true;
            }
            if(product < num) {
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return false;
    }
}