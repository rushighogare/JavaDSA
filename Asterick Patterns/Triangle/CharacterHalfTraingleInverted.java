import java.util.Scanner;

public class CharacterHalfTraingleInverted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        draw(n);
    }

    public static void draw(int n){
        for(int i=0; i<n; i++){
            for(char j='A'; j<='A'+n-i-1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
