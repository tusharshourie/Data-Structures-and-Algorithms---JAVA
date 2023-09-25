class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class deletekthnodecircularLL {
    static Node deletekth(Node head, int k){
        if(head==null) return head;
        if(k==1) return deleteHead(head);

        Node curr=head;
        for(int i =0;i<k-2;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

    static Node deleteHead(Node head){
        if(head==null) return null;
        if(head.next==head) return null;

        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
}
