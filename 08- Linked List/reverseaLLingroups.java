class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class reverseaLLingroups {
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    //recursive solution

    static Node reverseK(Node head, int k){
        Node curr=head;
        Node next=null;
        Node prev= null;
        int count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node rest_head=reverseK(next, k);
            head.next=rest_head;
        }
        return prev;
    }

    //iterative solution

    //  static Node reverseK(Node head, int k){
    //     Node curr=head;
    //     boolean isFirstPass=true;
    //     Node prevFirst= null;
    //     while(curr!=null){
    //         Node first=curr; 
    //         Node prev=null;
    //         int count=0;
    //         while(curr!=null && count<k){
    //         Node next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
    //         count++;
    //     }
    //     if(isFirstPass){head=prev; isFirstPass=false;}
    //     else{prevFirst.next=prev;}
    //     prevFirst=first;
    // }
    //     return head;
    // }

    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);
        int k=3;

        System.out.println("Linked List before reversal:" );
        printList(head);

        head=reverseK(head, k);

        System.out.println("Linked list after reversaL: ");
        printList(head);
    }
}
