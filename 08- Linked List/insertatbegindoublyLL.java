class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
        data=x;
        next=null;
        prev=null;
    }    
}
public class insertatbegindoublyLL{

    static Node insertBegin(Node head, int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null){
            head.prev=temp;
        }
        return temp;
    }

    static void printlist(Node head){
        Node current =head;
        while(current!=null){
            System.out.print(current.data+ " ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=null;
        head= insertBegin(head, 55);
        head= insertBegin(head, 56);
        head= insertBegin(head, 57);
        head= insertBegin(head, 58);

        printlist(head);


    }
}