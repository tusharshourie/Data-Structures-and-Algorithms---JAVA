class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

public class reversedoublyLL {

    static Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev; 
    }

    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node t2 = new Node(20);
        Node t3 = new Node(30);
        Node t4 = new Node(40);
        Node t5 = new Node(50);

        head.next = t2;
        t2.prev = head;
        t2.next = t3;
        t3.prev = t2;
        t3.next = t4;
        t4.prev = t3;
        t4.next = t5;
        t5.prev = t4;

        System.out.println("Linked list before reversal: ");
        printLinkedList(head);

        head = reverseLL(head);

        System.out.println("Linked List after reversal: ");
        printLinkedList(head);
    }
}
