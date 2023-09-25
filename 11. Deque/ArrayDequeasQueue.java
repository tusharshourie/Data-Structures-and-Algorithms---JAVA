import java.util.ArrayDeque;
public class ArrayDequeasQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.offer(10);
        ad.offer(20);
        System.out.println("top element= " + ad.peek());
        ad.poll();
        System.out.println("top element after poll= " + ad.peek());
        System.out.println(ad.peek());
        ad.offer(40);
        System.out.println("top element now= " + ad.peek());
    }
}


//functions that throw exceptions= add(), remove(), element()
//functions that return null/false = peek(), offer(), poll()