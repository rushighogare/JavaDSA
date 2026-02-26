import java.util.Scanner;

public class CharacterHalfTrianglePatternThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }

    public static void draw(int n){
        int ch=65+n-1;   //set the value of character from which we want to start. 

        for(int i=0; i<n; i++){
            for(int j=ch; j<=65+n-1; j++){
                System.out.print((char)j+" ");  //typecast from int to char.
            }
            System.out.println();
            ch--;
        }
    }
}
