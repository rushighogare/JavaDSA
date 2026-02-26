import java.util.Scanner;

public class CharacterHalfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }

    public static void draw(int n){
        for(int i=0; i<n; i++){
            for(char j='A'; j<='A'+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
