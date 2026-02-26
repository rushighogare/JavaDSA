import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        printDivisors(num);
    }

    public static void printDivisors(int num){
        for(int i=1; i<=num; i++){
            if(num%i==0) System.out.print(i+" ");
        }

        //more optimized way
        System.out.println();
        System.out.print("Optimized way: ");
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num%i==0){
                System.out.print(i+" ");

                 //bcoz when 2*3=6 it means 3*2=6, so we need to print both 2 and 3 and print both in single iteration, no need to reiterate for same factors but when 4*4=16 it means 4*4=16, so we need to print only 4 once.
                if(num/i!=i) System.out.print(num/i+" ");  
            }
        }
        
    }
}
