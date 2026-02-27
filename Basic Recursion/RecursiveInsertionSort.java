import java.util.Scanner;

public class RecursiveInsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());
        
        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }
        sc.close();

        recursiveInsertionSort(0, arr, size);

        System.out.println("Array after sorting: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //we have to take element and swap to left till it gets at correct position
    public static void recursiveInsertionSort(int start, int arr[], int n){
        if(start==n) return ;  //we have to check every element of array, sometimmes smallest element will be at last then we have to bring it at first
        
        int a=start;      //just to maintain start as it is because in below loop it will loose its orginal value if used.
        while(a>0 && arr[a]<arr[a-1]){   //run loop till the selected element gets its right position and traverse till left till condition is true
            int temp=arr[a];
            arr[a]=arr[a-1];
            arr[a-1]=temp;
            a--;
        }

        recursiveInsertionSort(start+1, arr, n);     //now increase count of element which is to be selected i.e start b/c till left array will be sorted, right array is remaining so we have to traverse till end
    }
}
