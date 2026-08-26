class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int ans = 1, max_freq = 0, n = s.length(), l = 0;

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            count.put(ch, count.getOrDefault(ch, 0) + 1);

            max_freq = Math.max(max_freq, count.get(ch));

            if (r - l + 1 - max_freq > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
