import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        sc.close();
        drawUpward(n);
        drawDownward(n);
    }

    public static void drawUpward(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawDownward(int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
