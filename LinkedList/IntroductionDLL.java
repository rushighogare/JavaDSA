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

public class IntroductionDLL {
    public static void main(String args[]){
        int arr[]=new int[]{1, 2, 3, 4, 5};

        Node head=convertInDLL(arr);
        printDLL(head);
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
    }
}
