package LinkedList;

import java.util.Scanner;

class Node{
    Node next;
    int data;

    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Deletion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{1, 2, 3, 4, 5, 6, 7};

        Node head=convertInLL(arr);
        System.out.println("Linked list before deletion of head: ");
        printLL(head);

        Node head2=deleteHead(head);   //when no reference is there to node then only it is deleted by garbage collector
        System.out.println("Linked list after deletion of head: ");
        printLL(head2);

        Node head3=deleteTail(head);
        System.out.println("Linked list after deletion of tail: ");
        printLL(head3);

        int k=3;
        Node head4=deleteKthNode(head, k);
        System.out.println("Linked list after deletion of Kth node: ");
        printLL(head4);

        int value=4;
        Node head5=deleteNodeByValue(head, value);
        System.out.println("Linked list after deletion of node by value: ");
        printLL(head5);
    }

    public static Node convertInLL(int arr[]){
        Node head=new Node(arr[0], null);
        Node temp=head;

        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }

        return head;
    }

    public static void printLL(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();
    }

    public static Node deleteHead(Node head){
        if(head==null) return null;
        return head.next;
    }

    private static Node deleteTail(Node head){
        if(head==null) return null;

        Node temp=head;

        while(temp.next.next!=null){
            temp=temp.next;
        }

        temp.next=null;   //tail node will be deleted by garbage collection and second last node will become tail node
        return head;
    }

    private static Node deleteKthNode(Node head, int k){
        //if head is null
        if(head==null) return head;
        
        //if k is 1 then head node will be deleted
        if(k==1) return head.next;

        Node temp=head;
        Node prev=null;
        int count=0;

        while(temp!=null){
            count++;

            if(count==k){
                prev.next=prev.next.next;   //skip Kth node and connect with next of Kth node so that Kth node will be deleted
            }

            prev=temp;
            temp=temp.next;
        }

        return head;
    }

    private static Node deleteNodeByValue(Node head, int value){
        if(head==null) return head;

        //if head node is to be deleted
        if(head.data==value) return head.next;

        Node temp=head;
        Node prev=null;

        while(temp!=null){
            if(temp.data==value){
                prev.next=prev.next.next;
                break;
            }

            prev=temp;
            temp=temp.next;
        }

        return head;
    }
}
