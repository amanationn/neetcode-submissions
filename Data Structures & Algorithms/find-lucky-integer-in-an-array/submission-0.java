class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int luckyNum = -1;
        for(int n: arr) {
            if(count.containsKey(n))
                count.put(n, count.get(n)+1);
            else
                count.put(n, 1);
        }
        for(int k: count.keySet()) {
            if(k == count.get(k))
                luckyNum = Math.max(luckyNum, k);
        }
        return luckyNum;
    }
}