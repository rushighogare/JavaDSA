import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }

    public static void draw(int n){
        int toggle=1;
        for(int i=0; i<n; i++){
            //set value of toggle here because we want to start even row with 1 and odd row with 0
            if(i%2==0) toggle=1;
            else toggle=0;

            for(int j=0; j<i+1; j++){
                System.out.print(toggle+" ");
                toggle=1-toggle;    //to toggle betweeen 0 and 1
            }
            System.out.println();
        }
    }
}
