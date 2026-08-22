class Solution {
    public String addBinary(String a, String b) {
        int m = a.length(), n = b.length();
        int i = m-1, j = n-1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >= 0) {
            char cha = a.charAt(i), chb = b.charAt(j);
            int sum = carry + (cha - '0') + (chb - '0');
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        while(i >= 0) {
            int sum = carry + (a.charAt(i) - '0');
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
        }
        while(j >= 0) {
            int sum = carry + (b.charAt(j) - '0');
            sb.append(sum % 2);
            carry = sum / 2;
            j--;
        }
        if(carry == 1)
            sb.append("1");
        return sb.reverse().toString();
    }
}