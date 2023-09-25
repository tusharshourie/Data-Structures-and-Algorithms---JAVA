class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class insertatendofcircularLL {
    static void printLinkedList(Node head){
        if(head==null) return;
        Node r = head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    static Node insertatEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t=temp.data;
            temp.data=head.data;
            head.data=t;
            return temp;   //temp is now new head
        }

    }
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=head;
        head=insertatEnd(head, 20);
        head=insertatEnd(head, 30);

        printLinkedList(head);
    }
}
