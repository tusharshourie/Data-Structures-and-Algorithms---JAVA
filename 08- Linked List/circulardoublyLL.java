//previous of head is last node
// next of last node is head

//ADVANTAGES:
// we get all the advantages of circular and doubly Linked Lists
// we can access last node in constant time without maintaining extra tail pointer/reference

class Node{
    int data;
    Node next; Node prev;
    Node(int x){
        data=x;
        next=prev=null;
    }
}

public class circulardoublyLL {
    static Node insertatHead(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;

    }

    static Node insertatEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return head;

    }
}
