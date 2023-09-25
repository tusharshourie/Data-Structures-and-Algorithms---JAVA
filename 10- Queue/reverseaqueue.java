import java.util.Queue;
// import java.util.Stack;
import java.util.LinkedList;

public class reverseaqueue {

    //ITERATIVE
    
    // static void reverse(Queue<Integer> q) {
    //     Stack<Integer> s = new Stack<>();
        
    //     while (!q.isEmpty()) {
    //         s.push(q.poll());
    //     }
        
    //     while (!s.isEmpty()) {
    //         q.offer(s.pop());
    //     }
    // }

    //RECURSIVE

    static void reverse(Queue<Integer> q) { 
       if(q.isEmpty())
        return;

        int x = q.peek();
        q.poll();

        reverse(q);
        q.offer(x);
    }
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        
        System.out.println("Original Queue: " + queue);
        reverse(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
