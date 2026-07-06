class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int len = fb.length;
        for(int i=0; i<len; ++i) {
            if(n == 0)
                return true;
            if(fb[i] == 0) {
                boolean leftEmpty = (i == 0) || fb[i-1] == 0;
                boolean rightEmpty = (i == len-1) || fb[i+1] == 0;
                if(leftEmpty && rightEmpty) {
                    n -= 1;
                    fb[i] = 1;
                }
            }
        }
        return n == 0;
    }
}