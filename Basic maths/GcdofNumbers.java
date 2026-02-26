import java.util.Scanner;

public class GcdofNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        sc.close();

        // gcdBruteForce(num1, num2);
        // gcdSomebetter(num1, num2);
        gcdOptimal(num1, num2);   //euclidean algorithm
    }

    public static void gcdBruteForce(int num1, int num2){
        int gcd=1;  //1 will be common divisor for all numbers

        for(int i=2; i<=Math.min(num1, num2); i++){
            if(num1%i==0 && num2%i==0) gcd=i;
        }

        System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd);
    }

    public static void gcdSomebetter(int num1, int num2){
        int gcd=1;

        for(int i=Math.min(num1, num2); i>1; i--){
            if(num1%i==0 && num2%i==0){
                gcd=i;
                break;  //we can break here because we are iterating from max to min, so first common divisor we get will be the greatest common divisor.
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd);
    }


    //euclidean algorithm - (if(num1>num2) -- num1=num1-num2 & viceversa) one number will be zero after some operations. Then another will be gcd. 
    //but here we are following more optimal than euclidean algo. means not to calculate difference, calculate mod and get gcd.
    public static void gcdOptimal(int num1, int num2){
        while(num1!=0 && num2!=0){
            if(num1>num2)num1=num1%num2;
            else num2=num2%num1;

            if(num1==0) System.out.println("GCD of given numbers is: "+num2);
            else if(num2==0) System.out.println("GCD of given numbers is: "+num1);
        }
    }
}
