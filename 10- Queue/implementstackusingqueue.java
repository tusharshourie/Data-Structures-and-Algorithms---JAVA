import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    
    public void push(int value) {
        q1.add(value);
    }
    
    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        
        int poppedValue = q1.poll();
        
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return poppedValue;
    }
    
    public int top() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        
        int topValue = q1.peek();
        
        q2.add(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return topValue;
    }
    
    public boolean isEmpty() {
        return q1.isEmpty();
    }
    
    public int size() {
        return q1.size();
    }
}

public class implementstackusingqueue {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 2
        System.out.println("Is empty? " + stack.isEmpty()); // Output: false
        System.out.println("Pop: " + stack.pop()); // Output: 1
        System.out.println("Is empty? " + stack.isEmpty()); // Output: true
    }
}
