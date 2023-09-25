class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class searchinLL {
    static void printLinkedList(Node head){       
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    // static int searchNode(Node head, int x){         //ITERATIVE APPROACH 
    //     int pos=1;
    //     Node curr=head;
    //     while(curr!=null){
    //         if(curr.data==x)
    //             return pos;
    //         else
    //             pos++;
    //             curr=curr.next;
    //     }
    //     return -1;
    // }

    static int searchNode(Node head, int x){         //RECURSIVE APPROACH 
        if(head==null) return -1;
        if(head.data==x) return 1;
        else{
            int res= searchNode(head.next, x);
            if(res==-1) 
                return -1;
            else 
                return (res+1);
        }
    }
    public static void main(String[] args) {
        Node head =null;
        head=new Node(20);
        head.next=new Node(25);
        head.next.next=new Node(35);
        head.next.next.next=new Node(40);

        System.out.println("the linked list: ");
        printLinkedList(head);

        System.out.println("The node is present at pos: ");
        System.out.println(searchNode(head, 35));

    }
}

//TIME=O(n)