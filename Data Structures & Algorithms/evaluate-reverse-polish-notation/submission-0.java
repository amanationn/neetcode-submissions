class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int x = 0, y = 0;
        for(String exp: tokens) {
            switch(exp) {
                case "+":
                    x = stk.pop();
                    y = stk.pop();
                    stk.push(x + y);
                    break;
                case "-":
                    x = stk.pop();
                    y = stk.pop();
                    stk.push(y - x);
                    break;
                case "*":
                    x = stk.pop();
                    y = stk.pop();
                    stk.push(x * y);
                    break;
                case "/":
                    x = stk.pop();
                    y = stk.pop();
                    stk.push(y / x);
                    break;
                default:
                    stk.push(Integer.parseInt(exp));
            }
        }
        return stk.pop();
    }
}
