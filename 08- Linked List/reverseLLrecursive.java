class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class reverseLLrecursive {
    //METHOD 1
    static Node reverseLinkedList(Node head){
        if (head==null) return head;
        if(head.next==null) return head;
        Node rest_head=reverseLinkedList(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }


    //METHOD 2
    // static Node reverseLinkedList(Node curr, Node prev){
    //     if(curr==null) return prev;
    //     Node next=curr.next;
    //     curr.next=prev;
    //     return reverseLinkedList(next, curr);
    // }
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

