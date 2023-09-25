//Simple Implementation

// class Queue{
//     int size, cap;
//     int arr[];
//     Queue(int c){
//         cap=c;
//         size=0;
//         arr=new int[cap];
//     }

//      boolean isFull(){
//         return(size==cap);
//     }

//      boolean isEmpty(){
//         return (size==0);
//     }

//      void enqueue(int x){
//         if(isFull()) return;
//         arr[size]=x;
//         size++;
//     }

//     void dequeue(){
//         if(isEmpty()) return;

//         for(int i=0; i<size-1; i++){
//             arr[i]=arr[i+1];
//         }
//         size--;
//     }

//     int getfront(){
//         if(isEmpty())  return -1;
//         else           return 0;
//     }

//     int getrear(){
//         if(isEmpty())  return -1;
//         else
//             return size-1;
//     }
// }


//Efficient Implementation (Circular Array)

class Queue{
    int arr[];
    int front, cap, size;
    Queue(int c){
        arr=new int[cap];
        cap=c;
        front=0;
        size=0;
    }

    boolean isFull(){
        return(size==cap);
    }

     boolean isEmpty(){
        return (size==0);
   }

    int getRear(){
        if(isEmpty()) return -1;
        else 
        return (front+size-1)%cap;
    }

    int getfront(){
        if(isEmpty())  return -1;
        else
        return front;
    }

    void dequeue(){
        if(isEmpty()) return;
        front=(front+1)%cap;
        size--;
    }

    void enqueue(int x){
        if(isFull()) return;
        int rear=getRear();
        rear=(rear+1)%cap;
        arr[rear]=x;
        size++;
    }
}

public class arrayimplementation{
    
    
    public static void main(String[] args) {
        
    }
}