class Deque{
    int size;
    int cap;
    int front;
    int []arr;
    Deque(int c){
       arr=new int[c];
       cap=c;
       front=0;
       size=0;
    }

    boolean isFull(){
        return (size==cap);  
    }

    boolean isEmpty(){
        return(size==0);
    }

    void insertRear(int x){
        if(isFull())  return;
        int new_rear=(front+size)%cap;
        arr[new_rear]=x;
        size++;
    }

    void deleteRear(){
        if(isEmpty()) return;
        size--;
    }

    int getRear(){
        if(isEmpty()) return -1;
        else
        return (front+size-1)%cap;
    }

    void insertFront(int x){
        if(isFull()) return;
        front=(front+cap-1)%cap;
        arr[front]=x;
        size++;
    }

    void deleteFront(){
        if(isEmpty()) return;
        front=(front+1)%cap;
        size--;
    }

    int getFront(){
        if(isEmpty()) return -1;
        else 
        return front;
    }
}


public class arrayimplementationofdeque{
    public static void main(String[] args) {
        Deque deque = new Deque(5);

        deque.insertRear(1);
        deque.insertRear(2);
        deque.insertRear(3);

        System.out.println("Front element: " + deque.getFront()); // Output: 1
        System.out.println("Rear element: " + deque.getRear());   // Output: 3

        deque.deleteFront();
        deque.deleteRear();

        System.out.println("Front element after deleteFront: " + deque.getFront()); // Output: 2
        System.out.println("Rear element after deleteRear: " + deque.getRear());   // Output: 2
    }
}