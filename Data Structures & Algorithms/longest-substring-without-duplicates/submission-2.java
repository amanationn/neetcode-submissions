class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int length = 0, l = 0, n = s.length();
        if(n == 0)
            return 0;
        for(int i=0; i<n; ++i) {
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)) {
                mp.put(ch, i);
            }
            else {
                length = Math.max(length, i - l);
                l = Math.max(l, mp.get(ch) + 1);
                mp.put(ch, i);
            }
        }
        if(mp.get(s.charAt(n-1)) == n-1)
            length = Math.max(length, n-l);
        return length;
    }
}
