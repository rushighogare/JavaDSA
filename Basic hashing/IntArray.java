import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.nextLine());
        }

        int hash[]=new int[100];
        solve(hash, arr, size);

        //enter number to search its frequency
        System.out.println("Enter number to search its frequency: ");
        int num=Integer.parseInt(sc.nextLine());
        int freq=hash[num];  //O(1) operation due to hashing otherwise it will take O(n) to find single number frequency.
        System.out.println("Frequency of "+num+" is: "+freq);
    }

    public static void solve(int hash[], int arr[], int size){
        for(int i=0; i<size; i++){
            hash[arr[i]]++;
        }
    }
}
