class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        int sum = 0;

        for(int num:nums) {
            sum += num;
            if(sum == k) {
                count++;
            }

            int sum_diff = sum - k;
            if(mp.containsKey(sum_diff)) {
                count += mp.get(sum_diff);
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}