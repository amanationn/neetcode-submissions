class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Deque<Integer> stk = new ArrayDeque<>();
        int n = nums2.length;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=n-1; i>=0; --i) {
            int curr = nums2[i];

            while(!stk.isEmpty() && stk.peek() <= curr) {
                stk.pop();
            }

            if(stk.isEmpty()) {
                mp.put(curr, -1);
            }
            else mp.put(curr, stk.peek());

            stk.push(curr);
        }

        int m = nums1.length;
        int[] ans = new int[m];
        for(int i=0; i<m; ++i) {
            ans[i] = mp.get(nums1[i]);
        }
        return ans;
    }
}