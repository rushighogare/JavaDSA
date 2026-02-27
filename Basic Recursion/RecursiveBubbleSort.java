import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());
        
        int arr[]=new int[size];
        System.out.println("Enter elements of array to sort: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        recursiveBubbleSort(arr, size);

        System.out.println("Sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void recursiveBubbleSort(int arr[], int n){
       if(n==1) return ;

       for(int i=0; i<n-1; i++){
        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
       }

       recursiveBubbleSort(arr, n-1);
    }
}
