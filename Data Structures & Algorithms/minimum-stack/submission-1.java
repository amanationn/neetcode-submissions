class Pair {
    int num;
    int minv;

    Pair(int num, int minv) {
        this.num = num;
        this.minv = minv;
    }
}

class MinStack {
    Deque<Pair> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        int minv = stack.isEmpty() ? value : Math.min(stack.peek().minv, value);
        Pair pair = new Pair(value, minv);
        stack.push(pair);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().num;
    }
    
    public int getMin() {
        return stack.peek().minv;
    }
}