class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //max heap order by frequency
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(b[1], a[1])
        );

        Map<Integer, Integer> freq = new HashMap<>();
        for(int x: nums) {
            if(!freq.containsKey(x))
                freq.put(x, 1);
            else freq.put(x, freq.get(x) + 1);
        }
        
        for(int key: freq.keySet()) {
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
