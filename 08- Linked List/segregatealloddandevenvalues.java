class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class segregatealloddandevenvalues {
    public static Node segregate(Node head) {
        Node eS = null;
        Node eE = null;
        Node oS = null;
        Node oE = null;

        for (Node curr = head; curr != null; curr = curr.next) {
            int x = curr.data;
            if (x % 2 == 0) {
                if (eS == null) {
                    eS = curr;
                    eE = eS;
                } else {
                    eE.next = curr;
                    eE = eE.next;
                }
            } else {
                if (oS == null) {
                    oS = curr;
                    oE = oS;
                } else {
                    oE.next = curr;
                    oE = oE.next;
                }
            }
        }

        if (oS == null || eS == null) {
            return head;
        }

        eE.next = oS;
        if (oE != null) {
            oE.next = null;
        }

        return eS;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);

        System.out.println("Original list:");
        printList(head);

        Node segregatedHead = segregate(head);

        System.out.println("List after segregating odd and even values:");
        printList(segregatedHead);
    }
}