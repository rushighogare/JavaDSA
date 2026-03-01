import java.util.ArrayList;
import java.util.Scanner;


//duplication allowed
public class IntersectionSortedArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int size1=Integer.parseInt(sc.nextLine());
        int arr1[]=new int[size1];
        System.out.println("Enter elements of first array in sorted order: ");
        for(int i=0; i<size1; i++){
            arr1[i]=Integer.parseInt(sc.next());
        }

        sc.nextLine();

        System.out.println("Enter size of second array: ");
        int size2=Integer.parseInt(sc.nextLine());
        int arr2[]=new int[size2];
        System.out.println("Enter elements of second array in sorted order: ");
        for(int i=0; i<size2; i++){
            arr2[i]=Integer.parseInt(sc.next());
        }

        // solveBruteForce(arr1, arr2);
        // solveBetter(arr1, arr2);
        solveOptimal(arr1, arr2);
    }

    public static void solveBruteForce(int arr1[], int arr2[]){
        ArrayList<Integer> list=new ArrayList<>();
        int visited[]=new int[arr2.length];   //already initialize to zero
       
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j] && visited[j]==0){
                    list.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
                else if(arr2[j]>arr1[i]) break;
            }
        }

        System.out.println("Intersection is: ");
        for(int k=0; k<list.size(); k++){
            System.out.print(list.get(k)+" ");
        }

    }

    public static void solveBetter(int arr1[], int arr2[]){
        ArrayList<Integer> list=new ArrayList<>();
        int visited[]=new int[arr2.length];
        int i=0, j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j] && visited[j]==0){
                list.add(arr1[i]);
                visited[j]=1;
                i++; 
                j++;
            }
            else if(arr1[i]<arr2[j]) i++;
            else j++;
        }

        System.out.println("Intersection is: ");
        for(int k=0; k<list.size(); k++){
            System.out.print(list.get(k)+" ");
        }
    }

    //no need of visited array
    public static void solveOptimal(int arr1[], int arr2[]){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0, j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]) i++;
            else j++;
        }

        System.out.println("Intersection is: ");
        for(int k=0; k<list.size(); k++){
            System.out.print(list.get(k)+" ");
        }
    }
}
