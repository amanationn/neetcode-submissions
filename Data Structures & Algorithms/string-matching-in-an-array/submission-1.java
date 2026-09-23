class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        Map<String, Boolean> mp = new HashMap<>();

        for(int i=0; i<n; ++i) {
            String word = words[i];
            int m = word.length();

            for(int j=0; j<n; ++j) {
                String curr = words[j];
                if(i == j || curr.length() < m) {
                    continue;
                }

                if(curr.contains(word) && !mp.containsKey(word)) {
                    ans.add(word);
                    mp.put(word, true);
                }
            }
        }
        return ans;
    }
}