class MinStack {
    Stack<Integer> stackList;
    public MinStack() {
        stackList = new Stack<>();
    }
    
    public void push(int val) {
        stackList.push(val);
    }
    
    public void pop() {
        stackList.pop();
    }
    
    public int top() {
        return stackList.peek();
    }
    
    public int getMin() {
        return stackList.stream().min(Integer::compare).orElse(0);
    }
}
