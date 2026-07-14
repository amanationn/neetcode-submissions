class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int k=0; k < n-3; ++k) {
            if(k > 0 && nums[k] == nums[k-1]) { //duplicate triplets (skip dup k)
                continue;
            }

            for(int i = k+1; i < n-2; ++i) {
                if(i > k+1 && nums[i] == nums[i-1]) { //duplicate triplets (skip dup i)
                    continue;
                }

                int l = i + 1, r = n - 1;
                while(l < r) {
                    long sum = (long) nums[k] + nums[i] + nums[l] + nums[r]; //typecasting to avoid overflow
                    if(sum == target) {
                        ans.add(Arrays.asList(nums[k], nums[i], nums[l], nums[r]));

                        //duplicate triplets
                        int temp = nums[l];
                        l += 1;
                        while(l < r && nums[l] == temp)
                            l += 1;
                        temp = nums[r];
                        r -= 1;
                        while(l < r && nums[r] == temp)
                            r -= 1;
                    }
                    else if(sum > target)
                        r -= 1;
                    else l += 1;
                }
            }
        }
        return ans;
    }
}