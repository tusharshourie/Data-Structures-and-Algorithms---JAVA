class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class LLimplementation{
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(25);
        head.next=temp1;
        temp1.next=temp2;

        System.out.print("Linked List: ");
        printLinkedList(head);
    }
}