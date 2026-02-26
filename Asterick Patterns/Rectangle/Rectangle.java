package Rectangle;
import java.util.*;

public class Rectangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();

        System.out.println("Enter number of columns:");
        int m=sc.nextInt();
        sc.close();

        draw(n, m);
    }

    public static void draw(int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}