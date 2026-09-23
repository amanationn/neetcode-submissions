class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for(int i=n-1; i>=0; --i) {
            int curr = temperatures[i];

            while(!stk.isEmpty() && temperatures[stk.peek()] <= curr) {
                stk.pop();
            }

            if(stk.isEmpty()) {
                ans[i] = 0;
            }
            else {
                ans[i] = stk.peek() - i; //peek has index of warmer temp day
            }

            stk.push(i); //curr
        }

        return ans;
    }
}
