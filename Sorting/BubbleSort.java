import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]=new int[size];

        System.out.println("Enter elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        bubbleSort(arr);

        System.out.println("Sorted array is: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        //algorithm is compare adjacent elements and swap if they are in wrong order, it means it will give right position first to large number
        for(int i=0; i<arr.length-1; i++){

            boolean didSwap=false; //to optimize the code, if not swapped means array already in sorted order

            for(int j=0; j<arr.length-i-1; j++){

                //swap if condition is met
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=true;
                }
            }

            if(!didSwap) break;   //if not swapped means array already sorted
        }
    }
}
