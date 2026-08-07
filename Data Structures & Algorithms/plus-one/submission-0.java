class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length, carry = 1;
        for(int i=n-1; i>=0; --i) {
            int sum = digits[i] + carry;
            if(sum <= 9) {
                digits[i] = sum;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int[] allNineArr = new int[n+1];
        allNineArr[0] = 1;
        return allNineArr;
    }
}
