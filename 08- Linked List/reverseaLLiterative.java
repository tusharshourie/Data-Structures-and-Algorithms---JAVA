class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class reverseaLLiterative {

    static Node reverseLinkedList(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    
public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);

        System.out.println("Linked List before reversal:" );
        printList(head);

        head=reverseLinkedList(head);

        System.out.println("Linked list after reversaL: ");
        printList(head);
    }
}

//TIME=O(n)
//SPACE=O(1)