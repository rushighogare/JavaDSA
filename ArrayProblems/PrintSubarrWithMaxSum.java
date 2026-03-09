import java.util.Scanner;

public class PrintSubarrWithMaxSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int size=Integer.parseInt(sc.next());
        int arr[]=new int[size];

        System.out.println("Enter elements of arr: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }
        sc.close();

        //brute and better will be same as longestSubarrWithSumk
        solveByKadanesAlgo(arr);   //optimal
    }

    public static void solveByKadanesAlgo(int arr[]){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int start=0;
        int end=0;

        for(int i=0; i<arr.length; i++){
            if(sum==0) start=i;

            sum+=arr[i];

            if(sum>=maxSum){
                end=i;
                maxSum=Math.max(maxSum, sum);
            }

            if(sum<0){
                sum=0;
            }
        }

        System.out.println("Maximum sum is: "+maxSum);
        System.out.println("That subarray is: ");
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
