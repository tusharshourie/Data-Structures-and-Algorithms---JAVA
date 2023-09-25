class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class insertatgivenposinLL {
    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static Node insertNode(Node head, int pos, int data){
        Node temp=new Node(data);
        if(pos==1){
            temp.next=head;
            return temp;
        }

        Node curr=head;
        for(int i=1; i<pos-2 && curr!=null; i++)
            curr=curr.next;
        
        if(curr==null)
            return head;
        
        temp.next=curr.next;
        curr.next=temp;
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

        insertNode(head, 2, 69);

        System.out.println("Updated Linked List after deleting first node: ");
        printLinkedList(head);
    }
}