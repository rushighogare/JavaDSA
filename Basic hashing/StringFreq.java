import java.util.Scanner;

public class StringFreq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();

        int hash[]=new int[26];

        //precomputation
        solve(hash, str);

        System.out.println("Enter character for frequency: ");
        char ch=sc.nextLine().charAt(0);

        //fetching
        int freq=hash[ch-'a'];   //O(1) operation due to hashing otherwise it will take O(n) to find single character frequency.
        System.out.println("Frequency of "+ch+" is: "+freq);
    }

    public static void solve(int hash[], String str){
        for(int i=0; i<str.length(); i++){
            hash[str.charAt(i)-'a']++;      //precomputation
        }
    }
}
