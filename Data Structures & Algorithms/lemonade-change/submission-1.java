class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> cash = new HashMap<>();
        for(int i=0; i<bills.length; ++i) {
            switch(bills[i]) {
                case 5:
                    cash.put(5, cash.getOrDefault(5, 0) + 1);
                    break;
                case 10:
                    if(cash.getOrDefault(5, 0) >= 1) {
                        cash.put(5, cash.get(5) - 1);
                        cash.put(10, cash.getOrDefault(10, 0) + 1);
                    }
                    else return false;
                    break;
                case 20:
                    if(cash.getOrDefault(5, 0) >= 1 && cash.getOrDefault(10, 0) >= 1) {
                        cash.put(5, cash.get(5) - 1);
                        cash.put(10, cash.get(10) - 1);
                        cash.put(20, cash.getOrDefault(20, 0) + 1);
                    }
                    else if(cash.getOrDefault(5, 0) >= 3) {
                        cash.put(5, cash.get(5) - 3);
                        cash.put(20, cash.getOrDefault(20, 0) + 1);
                    }
                    else return false;
                    break;
            }
        }
        return true;
    }
}