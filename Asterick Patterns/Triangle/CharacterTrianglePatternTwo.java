import java.util.Scanner;

public class CharacterTrianglePatternTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }

    public static void draw(int n){
        char ch='A';
        for(int i=0; i<n; i++){
            for(char j=ch; j<=ch+i; j++){
                System.out.print(ch+" ");   //we have to print same character for each row and every row will have unique next character.
            }
            System.out.println();
            ch+=1;  //update character for next row
        }
    }
}
