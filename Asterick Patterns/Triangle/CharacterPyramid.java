import java.util.Scanner;

public class CharacterPyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }

    public static void draw(int n){
     
        for(int i=0; i<n; i++){
            //for front spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            //for characters
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }

            //for trailing spaces -- it is not required but to maintain symmetry in code.
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
