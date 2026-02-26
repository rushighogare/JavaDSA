import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        sc.close();
        int result=calculateFibonacci(n);
        System.out.println("Fibonacci of "+n+" is: "+result);
    }

    public static int calculateFibonacci(int n){
        if(n<=1) return n;
        
        int last=calculateFibonacci(n-1);
        int secondLast=calculateFibonacci(n-2);
        return last+secondLast;
    }
}
