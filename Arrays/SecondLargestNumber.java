import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());

        System.out.println("Enter elements of array: ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        int result=solve(arr);
        System.out.println("Second largest element is: "+result);
    }

    public static int solve(int arr[]){
        int first=0, second=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>first){
                second=first;   //primarily update second pointer, then update first pointer
                first=arr[i];
            }
        }

        return second;
    }
}
