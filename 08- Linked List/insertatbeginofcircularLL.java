class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class insertatbeginofcircularLL {
    static void printList(Node head){
        if(head==null) return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        } while(r!=head);
    }

    static Node insertatBegin(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = head; 
        head = insertatBegin(head, 20);
        head = insertatBegin(head, 30);
        head = insertatBegin(head, 40);

       printList(head);
    }
}
