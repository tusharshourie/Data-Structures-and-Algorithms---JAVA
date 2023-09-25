class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}


public class insertionatbegofsinglyLL {
    
    static Node insertBegin(Node head, int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        return head;
    }

    static void printLinkedList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertBegin(head,30);
        head=insertBegin(head, 20);
        head=insertBegin(head, 40);

        System.out.println("The linked list is");
        printLinkedList(head);
        // return 0;
    }
}
//TIME=O(1)