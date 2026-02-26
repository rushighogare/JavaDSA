import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]=new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        selectionSort(arr);

        //sorted array
        System.out.println("Sorted array is: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Time complexity is nearly O(n^2), actual TC = n*(n+1)/2;   addition of first n natural numbers, see logic in notebook or in striver's video.
    public static void selectionSort(int arr[]){
        //algorithm is - find minimum element and swap it with current element, then find min from remaining array and swap it with current pointer and so on.
        for(int i=0; i<arr.length; i++){
            int minIndex=i;    //let i as index which have minimum element

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;        //got minimum element than we assumed at first, so update it
                }
            }

            //swap minimum element with current pointer so array starts to get sorted from starting index
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
