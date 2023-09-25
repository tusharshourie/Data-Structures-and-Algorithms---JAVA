class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class segregateevenoddnodes {
    static Node segregate(Node head) {
        Node eS = null; // Even list start
        Node eE = null; // Even list end
        Node oS = null; // Odd list start
        Node oE = null; // Odd list end

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
        oE.next = null;
        return eS;
    }
}
