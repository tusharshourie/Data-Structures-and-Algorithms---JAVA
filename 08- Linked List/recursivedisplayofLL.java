class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class recursivedisplayofLL {
    static void rPrint(Node head){
        if(head==null)
            return;
        System.out.println(head.data+" ");
        rPrint(head.next);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node t1=new Node(15);
        Node t2= new Node(20);

        head.next=t1;
        t1.next=t2;

        System.out.println("The linked list is: ");
        rPrint(head);
    }
}
//TIME=O(N)
//SPace=O(N)