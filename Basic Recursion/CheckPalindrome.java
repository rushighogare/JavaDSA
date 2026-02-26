import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        sc.close();

        boolean result=isPalindrome(str, 0, str.length()-1);
        if(result) System.out.println(str+" is a palindrome.");
        else System.out.println(str+" is not a palindrome.");
    }

    public static boolean isPalindrome(String str, int start, int end){
        if(start>=end) return true;

        if(str.charAt(start)!=str.charAt(end)) return false;

        boolean result=isPalindrome(str, start+1, end-1);
        return result;
    }
}
