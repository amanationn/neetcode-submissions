class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int a: asteroids) {
            if(stk.empty() || a > 0) {
                stk.push(a);
            }
            else {
                //if ast already moving in opp dir (stk having neg values)
                if(stk.peek() < 0) {
                    stk.push(a);
                    continue;
                }
                while(!stk.empty() && stk.peek() <= Math.abs(a)) {
                    //a is neg, so if we reach same sign ast in stk then stop (both moving in same dir)
                    if(stk.peek() < 0) {
                        stk.push(a);
                        break;
                    }
                    //same val, diff dir, both destroyed (and stop)
                    if(stk.peek() == Math.abs(a)) {
                        stk.pop();
                        break;
                    }
                    stk.pop(); //less val, opp dir (destroyed)
                    //in case the ast moving in opp dir destroyed all ast in the stk, so we push it into the stk (survived)
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