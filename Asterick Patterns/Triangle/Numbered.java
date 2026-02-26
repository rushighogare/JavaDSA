import java.util.Scanner;

public class Numbered {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of roows: ");
        int n=sc.nextInt();

        draw(n);
        sc.close();
    }

    public static void draw(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
