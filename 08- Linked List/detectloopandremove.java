class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
} 
public class detectloopandremove {
    static void isLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;        
            }
        if(slow!=fast)
         return;

        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
}
