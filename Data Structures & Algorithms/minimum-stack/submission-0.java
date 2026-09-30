class MinStack {

    Deque<Integer> stack;
    int minv = Integer.MAX_VALUE;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        minv = Math.min(minv, value);
        stack.push(value);
    }
    
    public void pop() {
        int top = stack.peek();
        stack.pop();
        if(top == minv) {
            minv = Integer.MAX_VALUE;
            for(int val: stack) {
                minv = Math.min(minv, val);
            }
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minv;
    }
}