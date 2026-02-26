import java.util.Scanner;

public class SumFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        sc.close();
        int result=calculateSum(n);
        System.out.println("Sum of first "+n+" numbers is: "+result);
    }

    public static int calculateSum(int n){
        if(n<=0) return 0;

        int sum=n+calculateSum(n-1);
        return sum;
    }
}
