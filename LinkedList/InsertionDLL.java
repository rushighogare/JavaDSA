package LinkedList;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data, Node prev, Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

public class InsertionDLL {
    public static void main(String args[]){
        int arr[]=new int[]{1, 2, 3, 4, 5};
        
        Node head=convertInDLL(arr);
        printDLL(head);

        int value=4;
        Node head2=insertBeforeHead(head, value);
        System.out.println("Linked list after insertion before head: ");
        printDLL(head2);

        Node head3=insertBeforeTail(head2, value);
        System.out.println("Linked list after insertion before tail: ");
        printDLL(head3);

        int k=3;
        Node head4=insertBeforeKthNode(head3, value, k);
        System.out.println("Linked list after insertion before Kth node: ");
        printDLL(head4);

        int value2=3;  //before this value2, we have to insert value node
        Node head5=insertBeforeValue(head4, value, value2);
        System.out.println("Linked list after inserting node value before given value: ");
        printDLL(head5);
    }

    private static Node convertInDLL(int arr[]){
        Node head=new Node(arr[0], null, null);

        Node temp=head;
        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            newNode.prev=temp;
            temp=newNode;
        }

        return head;
    }
    
    private static void printDLL(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    private static Node insertBeforeHead(Node head, int value){
        if(head==null){
            return new Node(value, null, null);
        } 

        Node newNode=new Node(value);
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return head;
    }

    private static Node insertBeforeTail(Node head, int value){
        if(head==null){
            return new Node(value);
        }

        Node tail=head;

        //traverse till tail node
        while(tail.next!=null){
            tail=tail.next;
        }

        //initialize before tail node to insert between beforeTail and tail node
        Node beforeTail=tail.prev;

        Node newNode=new Node(value);

        //make connection between beforeTail and new node
        beforeTail.next=newNode;
        newNode.prev=beforeTail;

        //make connection between new node and tail node
        newNode.next=tail;
        tail.prev=newNode;

        return head;
    }

    private static Node insertBeforeKthNode(Node head, int value, int k){
        if(head==null) return new Node(value);

        int count=1;
        Node temp=head;

        while(count!=k){
            count++;
            temp=temp.next;
        }

        Node beforeKthNode=temp.prev;
        Node afterKthNode=temp.next;

        //it means Kth node is head node
        if(beforeKthNode==null){
            return insertBeforeHead(head, value);
        }

        //it means Kth node is tail node
        if(afterKthNode==null){
            return insertBeforeTail(head, value);
        }

        Node newNode=new Node(value);
        
        //make connection with before Kth node
        beforeKthNode.next=newNode;
        newNode.prev=beforeKthNode;

        //make connection with temp node
        newNode.next=temp;
        temp.prev=newNode;

        return head;
    }

    private static Node insertBeforeValue(Node head, int value, int value2){
        if(head==null) return new Node(value);

        Node temp=head;

        while(temp.data!=value2){
            temp=temp.next;
        }

        Node beforeValue2Node=temp.prev;
        Node afterValue2Node=temp.next;


        //it means we have to insert before head
        if(beforeValue2Node==null) {    
            return insertBeforeHead(head, value);
        }

        //it means we have to insert before tail
        if(afterValue2Node==null){
            return insertBeforeTail(head, value);
        }

        Node newNode=new Node(value);

        //make connection between beforeValue2Node and new node
        beforeValue2Node.next=newNode;
        newNode.prev=beforeValue2Node;

        //make connection between temp and new node
        newNode.next=temp;
        temp.prev=newNode;

        return head;
    }
}
