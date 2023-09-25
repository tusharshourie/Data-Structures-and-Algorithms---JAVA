class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data=x;
        next=null;
        prev=null;
    }
}

public class insertatenddoublyLL {
    static Node insertatEnd(Node head, int data){
        Node temp=new Node(data);
        if(head==null)
            return temp;
        
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }

    static void printLinkedList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head= null;
        head= insertatEnd(head, 10);
        head= insertatEnd(head, 20);
        head= insertatEnd(head, 30);
        head= insertatEnd(head, 40);

        printLinkedList(head);
    }
}
