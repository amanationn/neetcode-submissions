class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //min heap (to store just top 3 freq element)
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[1], b[1])
        );

        Map<Integer, Integer> freq = new HashMap<>();
        for(int x: nums) {
            if(!freq.containsKey(x))
                freq.put(x, 1);
            else freq.put(x, freq.get(x) + 1);
        }
        
        for(int key: freq.keySet()) {
            if(pq.size() == k) {
                if(pq.peek()[1] < freq.get(key)) {
                    pq.poll();
                }
                else continue;
            }
            pq.add(new int[]{key, freq.get(key)});
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
