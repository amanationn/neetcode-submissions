class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[')
                stk.push(ch);
            else {
                if(!stk.empty() && checkValid(stk, ch))
                    stk.pop();
                else return false;
            }
        }
        return stk.empty();
    }
    private boolean checkValid(Stack<Character> stk, char ch) {
        char top = stk.peek();
        switch(ch) {
            case ')':
                if(top == '(')
                    return true;
                break;
            case '}':
                if(top == '{')
                    return true;
                break;
            case ']':
                if(top == '[')
                    return true;
                break;
        }
        return false;
    }
}
