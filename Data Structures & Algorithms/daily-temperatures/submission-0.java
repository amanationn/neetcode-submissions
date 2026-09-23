class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        int n = temperatures.length;
        Map<Integer, Integer> index = new HashMap<>();
        int[] ans = new int[n];

        for(int i=n-1; i>=0; --i) {
            int curr = temperatures[i];

            while(!stk.isEmpty() && stk.peek() <= curr) {
                stk.pop();
            }

            if(stk.isEmpty()) {
                ans[i] = 0;
            }
            else {
                int top = stk.peek();
                ans[i] = index.get(top) - i;
            }

            stk.push(curr);
            index.put(curr, i);
        }

        return ans;
    }
}
