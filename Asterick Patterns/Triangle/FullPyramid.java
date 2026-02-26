import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }
    
    public static void draw(int n){
        for(int i=0; i<n; i++){
            //for printing spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            //for printing stars
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }

            //to take to next line
            System.out.println();
        }
    }
}
