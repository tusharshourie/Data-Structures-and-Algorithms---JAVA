class Node{
    Node next;
    int data;
    Node(int x){
        data=x;
        next=null;
    }
}

public class deleteheadofcircularLL {
    
    static Node deleteHead(Node head){
        if(head==null) return null;
        if(head.next==head) return null;

        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
    public static void main(String[] args) {
         
    }
}
//Theta(1)