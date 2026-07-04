class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[')
                stk.push(ch);
            else {
                if(!stk.isEmpty() && checkValid(stk.peek(), ch))
                    stk.pop();
                else return false;
            }
        }
        return stk.isEmpty();
    }
    private boolean checkValid(char top, char ch) {
        switch(ch) {
            case ')':
                return top == '(';
            case '}':
                return top == '{';
            case ']':
                return top == '[';
        }
        return false;
    }
}
