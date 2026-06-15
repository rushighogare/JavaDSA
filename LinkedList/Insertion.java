package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Insertion {
    public static void main(String args[]){
        int arr[]=new int[]{1, 2, 3, 4, 5, 6, 7};

        Node head=convertInLL(arr);

        System.out.println("Linked list is: ");
        printLL(head);

        int value=8;
        Node head2=insertAtHead(head, value);
        System.out.println("Linkedlist after insertion at head: ");
        printLL(head2);

        Node head3=insertAtTail(head2, value);
        System.out.println("Linkedlist after insertion at tail: ");
        printLL(head3);

        int k=4;
        Node head4=insertAtKthPosition(head3, value, k);
        System.out.println("Linkedlist after insertion at Kth position: ");
        printLL(head4);

        int value2=4;
        Node head5=insertBeforeValue(head4, value, value2);
        System.out.println("Linkedlist after insertion before value: ");
        printLL(head5);
    }

    private static Node convertInLL(int arr[]){
        Node head=new Node(arr[0], null);
        Node temp=head;

        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }

        return head;
    }

    private static void printLL(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();
    }

    private static Node insertAtHead(Node head, int value){
        if(head==null){
            Node newNode=new Node(value);
            return newNode;
        }

        Node newNode=new Node(value);    
        newNode.next=head;
        head=newNode;
        return head;
    }

    private static Node insertAtTail(Node head, int value){
        if(head==null){
            Node newNode=new Node(value);
            return newNode;
        }

        Node temp=head;

        //iterate temp till last node 
        while(temp.next!=null){
            temp=temp.next;
        }

        //attach new node to last node
        Node newNode=new Node(value);
        temp.next=newNode;

        return head;
    }

    private static Node insertAtKthPosition(Node head, int value, int k){
        if(head==null){
            Node newNode=new Node(value);
            return newNode;
        }

        if(k==1){
            return new Node(value, head);
        }

        Node temp=head;
        int count=0;

        while(temp!=null){
            count++;

            if(count==k-1){
                Node newNode=new Node(value);
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }

            temp=temp.next;
        }

        return head;
    }

    private static Node insertBeforeValue(Node head, int value, int value2){
        if(head==null){
            return new Node(value);
        }

        if(head.data==value2){
            return new Node(value, head);
        }

        Node temp=head;

        while(temp.next!=null){
            if(temp.next.data==value2){
                Node newNode=new Node(value);
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }

            temp=temp.next;
        }

        return head;
    }
}


