class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; ++i) {
            Integer prev = mp.get(nums[i]);
            if(prev != null && i - prev <= k)
                return true;
            mp.put(nums[i], i);
        }
        return false;
    }
}