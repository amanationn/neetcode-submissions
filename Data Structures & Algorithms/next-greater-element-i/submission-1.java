class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> mp = new HashMap<>();
        Deque<Integer> stk = new ArrayDeque<>();

        int n = nums2.length;
        for(int i=n-1; i>=0; --i) {
            int cur = nums2[i];

            while(!stk.isEmpty() && stk.peek() <= cur) {
                stk.pop();
            }

            if(stk.isEmpty()) {
                mp.put(cur, -1);
            }
            else {
                mp.put(cur, stk.peek());
            }
            
            stk.push(cur);
        }

        int m = nums1.length;
        int[] ans = new int[m];
        for(int i=0; i<m; ++i) {
            ans[i] = mp.get(nums1[i]);
        }
        return ans;
    }
}