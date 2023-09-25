class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class deletelastnodeofsinglyLL {
    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static Node delLast(Node head){
        if(head==null) return null;
        if(head.next==null) return null;

        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
   public static void main(String[] args) {
        Node head = null;
        head = new Node(20);
        head.next = new Node(40);
        head.next.next = new Node(60);
        head.next.next.next = new Node(80);

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        head = delLast(head);

        System.out.println("Updated Linked List after deleting first node: ");
        printLinkedList(head);
    }
}

//Time=O(n)