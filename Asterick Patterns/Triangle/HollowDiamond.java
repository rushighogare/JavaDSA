import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        drawInverted(n);
        drawVertical(n);


        //butterfly pattern - only one line will be extra (run program then you will understand)
        //drawVertical(n);
        //drawInverted(n);
    }

    public static void drawInverted(int n){
        for(int i=0; i<n; i++){
            //for stars
            for(int j=0; j<=n-i-1; j++){
                System.out.print("*");
            }

            //for spaces
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }

            //for stars
            for(int j=0; j<=n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawVertical(int n){
        for(int i=0; i<n; i++){
            //for stars
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }

            //for spaces
            for(int j=0; j<2*(n-i-1); j++){
                System.out.print(" ");
            }

            //for stars
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
