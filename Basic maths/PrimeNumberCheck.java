import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        boolean result=isPrime(num);
        
        if(result) System.out.println(num+" is a prime number.");
        else System.out.println(num+" is not a prime number.");
    }

    public static boolean isPrime(int num){
        if(num<=1) return false;   //for 0 and 1, not negative numbers
        
        //logic of counting divisors in optimal way
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }

        return true;
    }
}
