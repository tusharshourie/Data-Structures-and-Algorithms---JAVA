//In circular linkedlist the next of last node is not null instead it is the head of the linked list

class Node{
    Node next;
    int data;
    Node(int x){
        data=x;
        next=null;
    }
}
public class circularLL {
    
                //FOR LOOP  
    // static void printList(Node head){
    //     if(head==null)  return;
        
    //     System.out.print(head.data + " ");

    //     for(Node r=head.next; r!=head; r=r.next){
    //         System.out.print(r.data+" ");
    //     }
    //     }

                //DO WHILE LOOP
    static void printList(Node head){
        if(head==null)  return;
        
        Node r=head;

        do{
            System.out.print(r.data+" ");
            r=r.next;
        } while(r!=head);
        }

    public static void main(String[] args) {
       Node head=new Node(10);
       head.next=new Node(15);
       head.next.next=new Node(20);
       head.next.next.next=new Node(25);
       head.next.next.next.next=head;

       printList(head);
    }
}


//ADVANTAGES:
// * we can traverse the whole list from any node
// * implementation of algos like round robin
// * we can insert at the beginning and end by just maintaining one tail reference/pointer

//DISADVANTAGES
// * implementation of operations become complex