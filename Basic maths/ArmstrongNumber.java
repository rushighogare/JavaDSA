import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        boolean result=armstrong(num);

        if(result) System.out.println(num+" is an armstrong number.");
        else System.out.println(num+" is not an armstrong number.");
    }

    public static boolean armstrong(int num){
        int sum=0;
        int temp=num;

        while(temp>0){
            int remainder=temp%10;
            sum+=remainder*remainder*remainder;
            temp/=10;
            if(sum==num) return true;
        }

        return false;
    }
}
