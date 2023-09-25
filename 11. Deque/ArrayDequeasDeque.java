import java.util.ArrayDeque;
public class ArrayDequeasDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.offerFirst(10);
        ad.offerFirst(20);
        ad.offerFirst(30);
        ad.offerFirst(40);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.pollFirst());
        System.out.println(ad.peekFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad.peekLast());
    }
}

//functions that throw exceptions = addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()
//functions that do not throw= offerFirst(), offerLast(), pollFirst(), pollLast(), peekFirst(), peekLast()