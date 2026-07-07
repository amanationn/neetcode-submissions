class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

        for(int k=0; k < strs[0].length(); ++k) {
            char ch = strs[0].charAt(k);

            for(int i=1; i <strs.length; ++i) {
                String str = strs[i];
                if(k >= str.length() || str.charAt(k) != ch) {
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}