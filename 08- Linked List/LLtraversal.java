class Node{
int data;
Node next;
Node(int x){
    data=x;
    next=null;
}
}

public class LLtraversal {

    static void printLinkedList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Node head= new Node(20);
        Node t1= new Node(29);
        Node t2= new Node(12);
        Node t3= new Node(98);

        head.next=t1;
        t1.next=t2;
        t2.next=t3;

        System.out.println("The linked list is: ");
        printLinkedList(head);
    }
}
