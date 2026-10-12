class Solution {
    public int minOperations(String[] logs) {
        int steps = 0;
        for(String opr: logs) {
            if(opr.equals("./")) {
                continue;
            }
            if(opr.equals("../")) {
                if(steps > 0)
                    steps--;
            }
            else steps++;
        }
        return steps;
    }
}