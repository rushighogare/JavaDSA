import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        sc.close();
        printName(n);
    } 
    
    public static void printName(int n){
        if(n==0) return;

        System.out.println("Rushikesh");
        printName(n-1);
    }
}
