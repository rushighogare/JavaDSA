import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]=new int[size];

        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }
        
        sc.nextLine();  //to consume one extra line
        System.out.println("Enter number to search in array: ");
        int num=Integer.parseInt(sc.nextLine());

        int index=linearSearch(arr, num);
        if(index!=-1) System.out.println("Number found with index: "+index);
        else System.out.println("Number not found");
    }

    public static int linearSearch(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num) return i;
        }

        return -1;
    }
}

