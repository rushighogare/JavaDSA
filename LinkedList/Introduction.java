package LinkedList;

import java.util.Scanner;

//for storing two types of data, (data and address to next node) we have to have an object. Thus create class of Node
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

public class Introduction {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{1, 2, 3, 4, 5};

        Node head=new Node(1, null);
        Node temp=head;

        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }

        System.out.println("Linked list head: "+head.data);

        printLL(head);

        int len=calculateLength(head);
        System.out.println("Length of linked list: "+len);

        System.out.println("Enter number to search in LL: ");
        int target=Integer.parseInt(sc.nextLine());
        boolean found=searchInLL(head, target);
        if(found) System.out.println("Element found in LL");
        else System.out.println("Element not found in LL");

        sc.close();
    }

    public static void printLL(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();
    }

    public static int calculateLength(Node head){
        int count=0;
        Node temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }

    public static boolean searchInLL(Node head, int target){
        Node temp=head;

        while(temp!=null){
            if(temp.data==target) return true;
            temp=temp.next;
        }

        return false;
    }
}
