class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class insertionatendofsinglyLL {

static void printLinkedList(Node head){
    Node current=head;
    while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
}

static Node insertEnd(Node head, int x){
    Node temp=new Node(x);
    if(head==null){
        return temp;
    }
    Node curr=head;
    while(curr.next!=null)
        curr=curr.next;
    curr.next=temp;
    return head;
}
 public static void main(String[] args) {
    Node head=null;
    head=insertEnd(head,10);
    head=insertEnd(head,20);
    head=insertEnd(head,40);

    System.out.print("THE LINKED LIST:");
    printLinkedList(head);
 }   
}
