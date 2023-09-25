// import java.util.*;

// public class DequeExample {
//     public static void main(String[] args) {
//         Deque<Integer> d = new LinkedList<Integer>();
//         // d.offerFirst(10);
//         // d.offerLast(20);
//         // d.offerFirst(5);
//         // d.offerLast(15);

//         d.addFirst(10);
//         d.addLast(20);
//         d.addFirst(5);
//         d.addLast(15);
//         System.out.println(d.getFirst());
//         System.out.println(d.getLast());
//         d.removeFirst();
//         d.removeLast();
//         System.out.println(d.getFirst());
//         System.out.println(d.getLast());


//         //traversal

//         // Iterator it =d.Iterator;
//         // while(it.hasNext()){
//         //     System.out.print(it.next()+" ");
//         // }
//         // System.out.println();

//         //traversal 2

//         // for(int x:d){
//         //     System.out.println(x+" ");
//         // }
//         // System.out.println();



//         //traversing from last to firrst
//         // Iterator it =d.descendingIterator;
//         // while(it.hasNext()){
//         //     System.out.print(it.next()+" ");
//         // }
//         // System.out.println();


//     }
// }


// //using getFirst(), getLast(), addFirst(), addLast(), removeLast(), removeFirst() instead of
// // peek, offer and poll throws exception