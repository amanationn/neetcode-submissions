class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count  = 0, l = 0, r = people.length - 1;
        while(l <= r) {
            if(people[r] + people[l] <= limit) {
                l += 1;
                r -= 1;
            }
            else r -= 1;
            count += 1;
        }
        return count;
    }
}