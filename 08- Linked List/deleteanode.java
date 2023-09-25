class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
} 
public class deleteanode {
    static void deleteNode(Node ptr){
        ptr.data=ptr.next.data;
        ptr.next= ptr.next.next;
    }
}
