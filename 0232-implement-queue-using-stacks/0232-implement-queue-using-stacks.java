class MyQueue {
    Stack<Integer> front;
    Stack<Integer> back;

    private void move() {
        if (back.isEmpty()) {
            while (!front.isEmpty()) {
                back.push(front.pop());
            }
        }
    }

    public MyQueue() {
        front = new Stack<>();
        back = new Stack<>();
    }
    
    public void push(int x) {
        front.push(x);
    }
    
    public int pop() {
        move();
        return back.pop();   
    }
    
    public int peek() {
        move();
        return back.peek();
    }
    
    public boolean empty() {
        return front.isEmpty() && back.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */