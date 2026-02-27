import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        sc.close();
        print(n);
    }

    public static void print(int n){
        if(n<=0) return;

        print(n-1);
        System.out.print(n+" ");
    }
}
