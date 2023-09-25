class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class removeduplicates {
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    static void removeDupli(Node head){
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data)
                curr.next=curr.next.next;
            else
                curr=curr.next;
        }
    }
    
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(50);

        System.out.println("Linked List before reversal:" );
        printList(head);

        removeDupli(head);

        System.out.println("Linked list after reversaL: ");
        printList(head);
    }
}
