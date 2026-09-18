class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp_sTot = new HashMap<>();
        Map<Character, Character> mp_tTos = new HashMap<>();
        int n = s.length();
        
        for(int i=0; i<n; ++i) {
            char chs = s.charAt(i), cht = t.charAt(i);
            
            if(mp_sTot.containsKey(chs) && mp_sTot.get(chs) != cht) {
                return false;
            }
            else if(mp_tTos.containsKey(cht) && mp_tTos.get(cht) != chs) {
                return false;
            }
            else {
                mp_sTot.put(chs, cht);
                mp_tTos.put(cht, chs);
            }
        }
        return true;
    }
}