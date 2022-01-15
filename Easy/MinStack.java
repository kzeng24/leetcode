/* Problem:

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack. */

class MinStack {
    List<Integer> list;
    
    public MinStack() {
        this.list = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        this.list.add(val);
    }
    
    public void pop() {
        this.list.remove(this.list.size() - 1);
    }
    
    public int top() {
        return this.list.get(this.list.size() - 1);
    }
    
    public int getMin() {
        List<Integer> copy = new ArrayList<Integer>();
        for (int num : this.list) {
            copy.add(num);
        }
        Collections.sort(copy);
        return copy.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
