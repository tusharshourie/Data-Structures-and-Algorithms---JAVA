class Node{
    Node next;
    Node prev;
    int data;
    Node(int x){
        data=x;
        next=prev=null;
    }
}

public class deletelastofdoublyLL {
    static void printLinkedList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    static Node deletelast(Node head){
        if(head==null) return null;

        if(head.next==null) return null;

        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node t1=new Node(20);
        Node t2=new Node(30);
        Node t3=new Node(40);
        
        head.next=t1;
        t1.prev=head;
        t1.next=t2;
        t2.prev=t1;
        t2.next=t3;
        t3.prev=t2;
    }
}

//TIME=Theta(n)