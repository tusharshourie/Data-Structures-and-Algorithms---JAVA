class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class nthnodefromendofLL {
    //USING LENGTH OF LL
    // static void printNthfromEnd(Node head, int n){
    //     int len=0;
    //     for(Node curr=head; curr!=null; curr=curr.next){
    //         len++;
    //     }
    //     if(len<n)
    //         return;
    //     Node curr=head;
    //     for(int i=0; i<len-n; i++)
    //         curr=curr.next;
    //     System.out.println(curr.data);
    // }


    //USING TWO REFERENCE/POINTER   
    static void printNthfromEnd(Node head, int n){
        if(head==null) return;

        Node first=head;
        for(int i=0; i<n;i++){
            if(first==null) return;
            first=first.next;
        }
        Node second=head;
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        System.out.println(second.data);
        
    }
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(60);
        head.next.next.next.next.next=new Node(70);

        int n=3;

        printNthfromEnd(head, n);
    }
}
