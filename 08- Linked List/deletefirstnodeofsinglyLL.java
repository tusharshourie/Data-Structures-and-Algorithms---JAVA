class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class deletefirstnodeofsinglyLL {
    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static Node delFirst(Node head) {
        if (head == null || head.next == null) {
            return null;
        } else {
            head = head.next;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = new Node(20);
        head.next = new Node(40);
        head.next.next = new Node(60);
        head.next.next.next = new Node(80);

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        head = delFirst(head);

        System.out.println("Updated Linked List after deleting first node: ");
        printLinkedList(head);
    }
}
//TIME+O(1)