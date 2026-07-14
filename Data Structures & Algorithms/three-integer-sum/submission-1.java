class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i < n-2; ++i) {
            while(i > 0 && i < n && nums[i] == nums[i-1]) { //to handle duplicate triplets
                i += 1;
            }
            System.out.println(i);
            int l = i + 1, r = n - 1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    //to handle duplicate triplets
                    int temp = nums[l];
                    l += 1;
                    while(l < r && nums[l] == temp)
                        l += 1;
                    temp = nums[r];
                    r -= 1;
                    while(l < r && nums[r] == temp)
                        r -= 1;
                }
                else if(sum > 0)
                    r -= 1;
                else l += 1;
            }
        }
        return ans;
    }
}
