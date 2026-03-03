import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//leaders are the elements from array which have all smaller numbers on their right
public class LeadersInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]=new int[size];

        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){  
            arr[i]=Integer.parseInt(sc.next());
        }

        printLeaders(arr);
    }

    public static void printLeaders(int arr[]){
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[n-1]);  //last element will always be leader b/c no one is there on its right
        int index=0;   //to check from list

        for(int i=n-2; i>=0; i--){
            if(arr[i]>list.get(index)){
                list.add(arr[i]);
                index++;
            }
        }   

        //to maintain order, reverse list
        Collections.reverse(list);
        
        System.out.println("Leaders are: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
