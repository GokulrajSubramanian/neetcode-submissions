class MinStack {

    private Stack<Integer>  stack;
    Stack<Integer> newStack = new Stack<>();
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(newStack.isEmpty() || newStack.peek()>=val){
            newStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(newStack.peek())){
            newStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
       return newStack.peek();
    }
}
