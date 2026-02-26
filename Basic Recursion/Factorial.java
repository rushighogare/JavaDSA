import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        sc.close();
        int result=calculateFactorial(n); //functional recursion
        solveFactorial(n, 1);  //parameterised recursion
        System.out.println("Factorial of "+n+" is: "+result);
    }

    public static int calculateFactorial(int n){
        if(n<=1) return 1;

        return n*calculateFactorial(n-1);
    }

    public static void solveFactorial(int n, int ans){
        if(n<=1){
            System.out.println("Factorial is: "+ans);
            return ;
        }

        solveFactorial(n-1, ans*n);
    }
}
