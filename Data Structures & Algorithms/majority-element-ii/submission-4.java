class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int num: nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);

            if(mp.size() > 2) {
                Iterator<Integer> itr = mp.keySet().iterator();

                while(itr.hasNext()) {
                    int key = itr.next();
                    int count = mp.get(key);

                    if(count == 1)
                        itr.remove();
                    else mp.put(key, count - 1);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int elm: mp.keySet()) {
            if(isMajority(nums, elm))
                ans.add(elm);
        }
        return ans;
    }

    private boolean isMajority(int[] nums, int k) {
        int n = nums.length, count = 0;
        for(int num: nums) {
            if(num == k)
                count++;
        }
        return count > (n / 3);
    }
}