class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s: strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if(!mp.containsKey(key)) {
                List<String> temp = new ArrayList<>();
                temp.add(s);
                mp.put(key, temp);
            }
            else {
                List<String> temp = mp.get(key);
                temp.add(s);
                mp.put(key, temp);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key: mp.keySet()) {
            ans.add(mp.get(key));
        }
        return ans;
    }
}