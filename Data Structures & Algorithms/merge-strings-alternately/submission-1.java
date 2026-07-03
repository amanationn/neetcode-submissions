class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length(), i = 0, j = 0;
        StringBuilder sb = new StringBuilder(m + n);
        while(i < m && j < n) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i += 1;
            j += 1;
        }
        sb.append(word1.substring(i));
        sb.append(word2.substring(j));
        return sb.toString();
    }
}