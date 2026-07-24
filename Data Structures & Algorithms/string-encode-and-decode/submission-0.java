class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for(String str: strs) {
            encoded_string.append("" + str.length());
            encoded_string.append(":");
            encoded_string.append(str);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while(i<str.length()) {
            int n = 0;
            while(str.charAt(i) != ':') {
                n = (n * 10) + (str.charAt(i) - '0');
                i += 1;
            }
            i += 1;
            StringBuilder temp = new StringBuilder();
            while(n > 0) {
                temp.append(str.charAt(i));
                i += 1;
                n -= 1;
            }
            decoded_strs.add(temp.toString());
        }
        return decoded_strs;
    }
}
