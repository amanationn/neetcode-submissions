class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];
        StringBuilder ans = new StringBuilder();
        boolean valid = true;
        for(int k=0; k < strs[0].length(); ++k) {
            char ch = strs[0].charAt(k);

            for(int i=1; i <strs.length; ++i) {
                String str = strs[i];
                if(k >= str.length() || str.charAt(k) != ch) {
                    valid = false;
                    break;
                }
            }
            
            if(valid) 
                ans.append(ch);
            else break;
        }
        return ans.toString();
    }
}