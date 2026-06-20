package LinkedList;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DeletionDLL {
    public static void main(String args[]){
        int arr[]=new int[]{1, 2, 3, 4, 5, 6};

        Node head=convertinDLL(arr);
        printDLL(head);

        Node head2=deleteHead(head);
        System.out.println("Linked list after deletion of head: ");
        printDLL(head2);

        Node head3=deleteTail(head2);
        System.out.println("Linked list after deletion of tail: ");
        printDLL(head3);

        int k=3;
        Node head4=deleteKthNode(head3, k);
        System.out.println("Linked list after deletion of Kth node: ");
        printDLL(head4);

        int value=3;
        Node head5=deleteNodeByValue(head4, value);
        System.out.println("Linked list after deletion of node by value: ");
        printDLL(head5);
    }

    private static Node convertinDLL(int arr[]){
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

    private static Node deleteHead(Node head){
        if(head==null || head.next==null) return null;   //if head is null or only one node is present then return null

        Node newHead=head;  //store reference of head node in newHead variable
        head=head.next;

        //separate newhead node from entire linked list and it will be deleted by garbage collector as no reference is pointing to it
        newHead.next=null;
        head.prev=null;

        return head;
    }

    private static Node deleteTail(Node head){
        if(head==null || head.next==null) return null;  //if head is null or only one node is present then return null

        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }

        Node beforeTail=tail.prev;  //store reference of before tail node in beforeTail variable
        beforeTail.next=null;  //separate tail node from entire linked list and it will be deleted by garbage collector as no reference is pointing to it
        tail.prev=null;
        return head;
    }

    private static Node deleteKthNode(Node head, int k){
        if(head==null || head.next==null) return null;  

        int count=1;
        Node temp=head;
        while(count!=k){
            count++;
            temp=temp.next;
        }

        Node beforeKthNode=temp.prev;
        Node afterKthNode=temp.next;

        //it means kth node is head node, so call deleteHead function
        if(beforeKthNode==null){
            head=deleteHead(head);
            return head;
        }

        //it means kth node is tail node, so call deleteTail function
        if(afterKthNode==null){
            head=deleteTail(head);
            return head;
        }

        //separate Kth node from linked list
        beforeKthNode.next=afterKthNode;
        afterKthNode.prev=beforeKthNode;

        return head;
    }

    private static Node deleteNodeByValue(Node head, int value){
        if(head==null) return null;

        Node temp=head;
        while(temp.data!=value){
            temp=temp.next;
        }

        Node beforeValue=temp.prev;
        Node afterValue=temp.next;

        //it means value is at head
        if(beforeValue==null){
            head=deleteHead(head);
            return head;
        }

        //it means value is at tail
        if(afterValue==null){
            head=deleteTail(head);
            return head;
        }

        //separate node of given value from linked list
        beforeValue.next=afterValue;
        afterValue.prev=beforeValue;
        return head;
    }
}
