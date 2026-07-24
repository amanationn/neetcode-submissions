class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //max heap order by frequency
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(b[1], a[1])
        );

        int[] freq = new int[2001];
        for(int x: nums) {
            freq[x + 1000] += 1;
        }
        
        for(int i=0; i<2001; ++i) {
            pq.add(new int[]{i - 1000, freq[i]});
        }

        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty() && k != 0) {
            ans[i] = pq.poll()[0];
            i += 1;
            k -= 1;
        }

        return ans;
    }
}
