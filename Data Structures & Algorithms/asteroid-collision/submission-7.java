class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int a: asteroids) {
            if(a > 0 || stk.empty()) {
                stk.push(a);
            }
            else {
                int curr = -a;
                while(!stk.empty() && stk.peek() > 0 && stk.peek() < curr) {
                    stk.pop();
                }
                if(stk.empty() || stk.peek() < 0) //1. cur ast destroyed all ast in the stk, so we push it into the stk, 2. curr is neg, so if we reach same sign ast in stk then stop (as both moving in same dir, no collison)
                    stk.push(a);
                else if(stk.peek() == curr) //same val, both destroyed
                    stk.pop();
            }
        }
        int n = stk.size();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; --i) {
            ans[i] = stk.pop();
        }
        return ans;
    }
}