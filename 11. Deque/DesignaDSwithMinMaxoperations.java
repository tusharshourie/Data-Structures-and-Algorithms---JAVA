//Design a DS that supports following operations with O(1) time:
//insertMin(x)
//insertMax(x)
//getMin()
//getMax()
//extractMin()
//extractMax()

import java.util.ArrayDeque;

public class DesignaDSwithMinMaxoperations {
    ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
    
    void insertMin(int x){
        dq.offerFirst(x);
    }
    void insertMax(int x){
        dq.offerLast(x);
    }
    int getMin(){
        return dq.peekFirst();
    }
    int getMax(){
        return dq.peekLast();
    }
    int extractMax(){
        return dq.pollLast();
    }
    int extractMin(){
        return dq.pollFirst();
    }

    public static void main(String[] args) {
        DesignaDSwithMinMaxoperations ds = new DesignaDSwithMinMaxoperations();

        ds.insertMin(5);
        ds.insertMax(10);
        ds.insertMin(3);
        ds.insertMax(15);

        System.out.println("Minimum: " + ds.getMin()); // Output: 3
        System.out.println("Maximum: " + ds.getMax()); // Output: 15

        int minExtracted = ds.extractMin();
        int maxExtracted = ds.extractMax();

        System.out.println("Extracted Minimum: " + minExtracted); // Output: 3
        System.out.println("Extracted Maximum: " + maxExtracted); // Output: 15

        System.out.println("Updated Minimum: " + ds.getMin()); // Output: 5
        System.out.println("Updated Maximum: " + ds.getMax()); // Output: 10

    }
}
