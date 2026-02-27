import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        sc.close();
        // print(n);
        printByBackTrack(1, n);
    }

    public static void print(int n){
        if(n<=0) return;

        System.out.print(n+" ");
        print(n-1);
    }

    public static void printByBackTrack(int i, int n){
        if(i>n) return;

        printByBackTrack(i+1, n);
        System.out.print(i+" ");
    }
}
