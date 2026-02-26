import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());

        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        bruteForce(arr);
        // byHashing(arr);
        // bySum(arr);
    }

    //brute force
    public static void bruteForce(int arr[]){
        //run two loops
        boolean flag=false;

        for(int i=0; i<=arr.length; i++){
            flag=false;

            for(int j=0; j<arr.length; j++){
                if(arr[j]==i){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                System.out.println("Missing number is: "+i);
                break;
            }
        }

        if(flag) System.out.println("All n numbers are present.");

    }

    public static void byHashing(int arr[]){
        int hash[]=new int[arr.length+2];

        //precomputation
        for(int i=0; i<arr.length; i++){
            hash[arr[i]]++;
        }

        //fetching
        for(int i=1; i<hash.length; i++){
            if(hash[i]==0){
                System.out.println("Missing number is: "+i); 
            }
        }
    }

    //by sum of natural numbers (to get correct output, enter array input from 0 )
    public static void bySum(int arr[]){
        int n=arr.length;
        int sum=n*(n+1)/2;
        int tempSum=0;

        for(int i=0; i<arr.length; i++){
            tempSum+=arr[i];
        }

        int missingNum=sum-tempSum;
        System.out.println("Missing number is: "+missingNum);
    }
}
