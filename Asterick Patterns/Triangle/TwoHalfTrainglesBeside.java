import java.util.Scanner;

public class TwoHalfTrainglesBeside {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }

    public static void draw(int n){
        for(int i=0; i<n; i++){
            int count=0;

            //for front traingle
            for(int j=0; j<i+1; j++){
                count++;
                System.out.print(count);
            }

            //for middle space
            for(int j=i+1; j<2*n-i-1; j++){
                System.out.print(" ");
            }

            //for back traingle
            for(int j=n-i-1; j<n; j++){
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}
