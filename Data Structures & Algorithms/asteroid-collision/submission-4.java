class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int a: asteroids) {
            if(stk.empty() || a > 0) {
                stk.push(a);
            }
            else {
                if(stk.peek() < 0) {
                    stk.push(a);
                    continue;
                }
                while(!stk.empty() && stk.peek() <= Math.abs(a)) {
                    if(stk.peek() < 0) {
                        stk.push(a);
                        break;
                    }
                    if(stk.peek() == Math.abs(a)) {
                        stk.pop();
                        break;
                    }
                    stk.pop();
                    if(stk.empty() && a < 0) {
                        stk.push(a);
                        break;
                    }
                }
            }
        }
        int n = stk.size();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; --i) {
            ans[i] = stk.peek();
            stk.pop();
        }
        return ans;
    }
}