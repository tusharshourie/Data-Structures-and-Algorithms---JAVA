class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class MyStack{
    Node head;
    int s;
    MyStack(){
        head=null;
        s=0;
    }
    int size(){
        return s;
    }

    boolean isEmpty(){
        return(head==null);
    }

    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
    }

    int pop(){
        if(head==null)
            return Integer.MAX_VALUE;
            int res=head.data;
            head=head.next;
            s--;
            return res;
    }

    int peek(){
        if(head==null){
            return Integer.MAX_VALUE;
        
        }
        return head.data;
    }
}

public class linkedlistimplementation{
    public static void main(String[] args) {
        
    }
}

//time for every fn = O(1)