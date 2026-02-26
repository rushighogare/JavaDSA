import java.util.Scanner;

public class FullPyramidInverted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }

    public static void draw(int n){
        for(int i=0; i<n; i++){
            //for spaces 
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            //for stars
            for(int j=0; j<2*n-2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
