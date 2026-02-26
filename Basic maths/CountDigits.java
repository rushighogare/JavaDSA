import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        int result=calculate(n);
        
        System.out.println("There are total "+result+" digits in given number.");
    }

    public static int calculate(int n){
        int count=0; 
        while(n>0){
            n/=10;
            count++;
        }

        return count;
    }
}
