class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> score = new Stack<>();
        for(int i=0; i<op.length; ++i) {
            switch(op[i]) {
                case "+":
                    int top = score.pop();
                    int new_score = top + score.peek();
                    score.push(top);
                    score.push(new_score);
                    break;
                case "D":
                    score.push(score.peek() * 2);
                    break;
                case "C":
                    score.pop();
                    break;
                default:
                    score.push(Integer.parseInt(op[i]));
            }
        }
        int points = 0;
        while(!score.isEmpty()) {
            points += score.pop();
        }
        return points;
    }
}