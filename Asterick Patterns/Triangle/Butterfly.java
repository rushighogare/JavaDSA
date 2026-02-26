//to write patterns we have to decide only logic between n and i.

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        draw(n);
        sc.close();
    }   

    public static void draw(int n){
        int starsLimit=0;
        int spacesLimit=0;

        for(int i=0; i<2*n-1; i++){
            if(i<n){
                starsLimit=i+1;
                spacesLimit=2*(n-i-1);
            }
            else{
                starsLimit=2*n-i-1;
                spacesLimit=2*(i-n+1);
            }

            //for stars
            for(int j=0; j<starsLimit; j++){
                System.out.print("*");
            }

            //for spaces
            for(int j=0; j<spacesLimit; j++){
                System.out.print(" ");
            }

            //for stars
            for(int j=0; j<starsLimit; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
