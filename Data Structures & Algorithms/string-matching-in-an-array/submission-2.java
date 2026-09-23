class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();

        for(int i=0; i<n; ++i) {
            String word = words[i];
            int m = word.length();

            for(int j=0; j<n; ++j) {
                String curr = words[j];
                if(i == j || curr.length() < m) {
                    continue;
                }

                if(curr.contains(word)) {
                    ans.add(word);
                    break; //to avoid adding duplicates
                }
            }
        }
        return ans;
    }
}