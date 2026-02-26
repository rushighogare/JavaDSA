import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]=new int[size];

        System.out.println("Enter elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        insertionSort(arr);

        //sorted array
        System.out.println("Sorted array is: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int arr[]){
        //algorithm is take one element and place it at its correct position, correct position should be found in left side of array only because we sorting in ascending order
        for(int i=0; i<arr.length; i++){
            int j=i;

            //check if current element is at right position or need to shift left side to its correct position
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;     //keep shifting left side until we get right position for current element, if current element is greater than left side element then it is at right position and we can break the loop
            }
        }
    }
}
