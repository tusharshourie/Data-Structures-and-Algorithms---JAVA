import java.util.ArrayDeque;
public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<Integer>();
        // ad.add(10);
        // ad.add(20);
        // ad.add(30);

        ad.push(10);
        ad.push(20);
        System.out.println(ad.peek());
        System.out.println("popped element= " + ad.pop());
        System.out.println(ad.peek());
        ad.push(40);
        System.out.println(ad.peek());
    }
}


//has all the functionalities of stack and queue like push pop offer poll etc